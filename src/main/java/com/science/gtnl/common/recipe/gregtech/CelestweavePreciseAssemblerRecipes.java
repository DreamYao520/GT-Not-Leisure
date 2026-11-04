package com.science.gtnl.common.recipe.gregtech;

import static gregtech.api.util.GTRecipeConstants.PRECISE_ASSEMBLER_CASING_TIER;

import com.science.gtnl.api.IRecipePool;
import com.science.gtnl.utils.enums.GTNLItemList;
import com.science.gtnl.utils.recipes.RecipeBuilder;

import goodgenerator.api.recipe.GoodGeneratorRecipeMaps;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.enums.TierEU;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.util.GTOreDictUnificator;

public class CelestweavePreciseAssemblerRecipes implements IRecipePool {

    public RecipeMap<?> CPS = GoodGeneratorRecipeMaps.preciseAssemblerRecipes;

    @Override
    public void loadRecipes() {

        RecipeBuilder.builder()
            .itemInputs(
                GTOreDictUnificator.get(OrePrefixes.plateDouble, Materials.Naquadria, 8),
                GTOreDictUnificator.get(OrePrefixes.foil, Materials.Netherite, 4),
                GTOreDictUnificator.get(OrePrefixes.circuit, Materials.ZPM, 16),
                ItemList.Field_Generator_ZPM.get(2))
            .fluidInputs(Materials.SolderingAlloy.getMolten(4608), Materials.Helium.getGas(4000))
            .itemOutputs(GTNLItemList.CelestweaveModuleFlight.get(1))
            .duration(60)
            .eut(TierEU.RECIPE_ZPM)
            .metadata(PRECISE_ASSEMBLER_CASING_TIER, 2)
            .addTo(CPS);
    }
}
