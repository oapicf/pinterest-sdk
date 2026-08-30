#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "catalogs_product_group_multiple_pinterest_product_category_criteria.h"


char* catalogs_product_group_multiple_pinterest_product_category_criteria_values_ToString(pinterest_rest_api_catalogs_product_group_multiple_pinterest_product_category_criteria__e values) {
    char *valuesArray[] =  { "NULL", "ACCENT_TABLES", "ACCESSORIES", "ANKLETS", "APRONS", "AREA_RUGS", "ARMOIRES_AND_WARDROBES", "ART_AND_CRAFT_PAINTS", "ART_BRUSHES", "ARTIFICIAL_FLORA", "ARTWORK", "AUDIO", "AUDIO_ACCESSORIES", "BACKPACKS", "BAG_AND_LUGGAGE_ACCESSORIES", "BAGS_AND_LUGGAGE", "BAKEWARE", "BANDANAS", "BAR_CARTS", "BARWARE", "BASKETS", "BATH_AND_BODY", "BATH_AND_SHOWER", "BATH_MATS_AND_RUGS", "BATH_TOWELS_AND_WASHCLOTHS", "BATHROOM_ACCESSORIES", "BATHROOM_ACCESSORY_SETS", "BATHROOM_VANITIES", "BEACH_TOWELS", "BEADS_AND_JEWELRY_MAKING_SUPPLIES", "BEAUTY_SUPPLEMENTS", "BED_SHEETS", "BEDDING", "BEDROOM_VANITIES", "BEDS_AND_ACCESSORIES", "BEDS_AND_BED_FRAMES", "BELT_BAGS", "BELTS_AND_SUSPENDERS", "BENCHES", "BEVERAGES", "BIRD_SUPPLIES", "BLANKETS", "BLOUSES", "BLUSHES_AND_BRONZERS", "BODY_CARE", "BODY_JEWELRY", "BODY_MAKEUP", "BODY_MOISTURIZERS", "BODY_WASHES", "BOOKCASES_AND_STANDING_SHELVES", "BOOKENDS", "BOOKS", "BOOTS", "BRACELETS", "BRIDESMAID_DRESSES", "BROOCHES_AND_LAPEL_PINS", "BROW_MAKEUP", "BUFFETS_AND_SIDEBOARDS", "BUTTON_DOWN_SHIRTS", "CABINET_HARDWARE", "CABINETS_AND_STORAGE_FURNITURE", "CAKE_DECORATING_SUPPLIES", "CAMPING_AND_HIKING", "CANDLE_HOLDERS", "CANDLES", "CARDSTOCK_PAPERS", "CASUAL_PANTS", "CAT_SUPPLIES", "CHAIRS", "CHANDELIERS", "CHARMS_AND_PENDANTS", "CHINA_CABINETS_AND_HUTCHES", "CLOGS_AND_MULES", "CLOTH_NAPKINS", "CLOTHING", "CLOTHING_AND_CLOSET_STORAGE", "CLOTHING_SETS", "COASTERS", "COATS_AND_JACKETS", "COFFEE_AND_TEA_CUPS", "COFFEE_MAKERS_AND_ESPRESSO_MACHINES", "COLORING_BOOKS", "COMMUNICATIONS", "COMPUTER_ACCESSORIES", "COOKIE_CUTTERS", "COOKWARE", "COOKWARE_AND_BAKEWARE", "COSMETIC_AND_TOILETRY_BAGS", "COSTUMES_AND_ACCESSORIES", "CRAFT_ADHESIVES_AND_MAGNETS", "CRAFT_CUTTING_TOOLS", "CRAFT_MOLDS", "CRIBS_AND_TODDLER_BEDS", "CURTAIN_AND_DRAPE_RODS", "CURTAINS_AND_DRAPES", "CUTTING_BOARDS", "CYCLING", "DECORATIVE_BOWLS", "DECORATIVE_JARS", "DECORATIVE_TAPESTRIES", "DECORATIVE_TRAYS", "DEODORANTS_AND_ANTIPERSPIRANTS", "DESK_AND_SHELF_CLOCKS", "DESKS", "DIAPER_BAGS", "DINNERWARE", "DISHWASHERS", "DOG_SUPPLIES", "DOOR_MATS", "DRAWING_AND_PAINTING", "DRESS_PANTS", "DRESSERS", "DRESSES", "DRILLS_AND_SCREWDRIVERS", "DRINKWARE", "DUFFEL_BAGS", "DUVET_COVERS", "DVDS_AND_VIDEOS", "EARRINGS", "ELECTRONICS_ACCESSORIES", "ENGAGEMENT_AND_WEDDING_RINGS", "ENTERTAINMENT_CENTERS_AND_TV_STANDS", "ERASERS", "EYE_MAKEUP", "EYE_SHADOW", "EYELINERS", "FABRIC", "FACE_COVERINGS", "FACE_LOTIONS_AND_CREAMS", "FACE_MAKEUP", "FACIAL_CLEANSERS", "FACIAL_MOISTURIZERS", "FALSE_EYELASHES", "FIGURINES", "FIREPLACE_AND_WOOD_STOVE_ACCESSORIES", "FIREPLACES", "FISHING", "FLAGS_AND_WINDSOCKS", "FLATS", "FLATWARE", "FLOOR_LAMPS", "FLOWER_GIRL_DRESSES", "FOOD_AND_BEVERAGE_CARRIERS", "FOOD_COOKERS_AND_STEAMERS", "FOOD_ITEMS", "FOOD_MIXERS_AND_BLENDERS", "FOOD_STORAGE_CONTAINERS", "FOOD_STORAGE_SUPPLIES", "FOUNDATIONS_AND_CONCEALERS", "FOUNTAINS_AND_PONDS", "FRAGRANCE", "FURNITURE", "FURNITURE_SETS", "GAMES", "GARDENING", "GARDENING_TOOLS", "GLOVES_AND_MITTENS", "GLUES_AND_TAPES", "GROOM_AND_GROOMSMEN_SUITS", "HAIR", "HAIR_ACCESSORIES", "HAIR_CARE", "HAIR_COLOR", "HAIR_COMBS", "HAIR_PINS_CLAWS_AND_CLIPS", "HAIR_REMOVAL", "HAIR_TOOLS", "HAIR_TREATMENT", "HAIR_WREATHS", "HAND_AND_FOOT_CARE", "HAND_SOAPS_AND_SANITIZERS", "HANDBAGS", "HANDKERCHIEFS", "HARDWARE_SUPPLIES", "HATS", "HEADBOARDS_AND_FOOTBOARDS", "HEADWEAR", "HIGHLIGHTERS", "HOBBIES_AND_CREATIVE_ARTS", "HOME_ACCESSORIES", "HOME_DECOR_DECALS", "HOME_FRAGRANCE_ACCESSORIES", "HOME_FRAGRANCES", "HOME_IMPROVEMENT_TOOLS_AND_SUPPLIES", "HOSIERY", "HOUSEHOLD_APPLIANCES", "HOUSEHOLD_SUPPLIES", "INCENSE", "INDOOR_GAMES", "JEANS", "JEWELRY_AND_WATCH_ACCESSORIES", "JEWELRY_AND_WATCHES", "JEWELRY_SETS", "JUMPSUITS_AND_ROMPERS", "KEYCHAINS", "KITCHEN_AND_DINING", "KITCHEN_AND_DINING_ROOM_TABLES", "KITCHEN_APPLIANCES", "KITCHEN_KNIVES", "KITCHEN_LINENS", "KITCHEN_MATS", "KITCHEN_ORGANIZERS", "KITCHEN_TOOLS_AND_UTENSILS", "KITCHEN_TOWELS", "KNITTING_AND_CROCHET", "KNITTING_AND_CROCHET_TOOLS", "LAMP_SHADES", "LAMPS", "LANYARDS", "LAUNDRY_HAMPERS_AND_SUPPLIES", "LAWN_AND_GARDEN", "LAWN_AND_GARDEN_DECOR", "LAWN_ORNAMENTS_AND_GARDEN_SCULPTURES", "LEGGINGS", "LEOTARDS_AND_UNITARDS", "LIGHTING", "LIGHTING_ACCESSORIES", "LIGHTING_FIXTURES", "LIP_BALMS", "LIP_CARE", "LIP_MAKEUP", "LIPSTICKS_AND_LIP_GLOSSES", "MAGAZINES_AND_NEWSPAPERS", "MAGNETS", "MAKEUP", "MAKEUP_TOOLS", "MASCARAS", "MATTRESSES", "MEASURES_AND_RULERS", "MEASURING_TOOLS_AND_SENSORS", "MESSENGER_BAGS", "MIRRORS", "MUSIC_AND_SOUND_RECORDINGS", "NAIL_ART", "NAIL_ART_KIT_AND_TOOLS", "NAIL_CARE", "NAIL_POLISHES", "NAILS", "NECKLACES", "NECKTIES", "NIGHT_LIGHTS_AND_AMBIENT_LIGHTING", "NIGHTSTANDS", "NOVELTY_SIGNS", "ONE_PIECES", "ONESIES", "OTTOMANS", "OUTDOOR_FURNITURE", "OUTDOOR_FURNITURE_SETS", "OUTDOOR_GAMES", "OUTDOOR_GRILLS", "OUTDOOR_LIVING", "OUTDOOR_PLAY_EQUIPMENT", "OUTDOOR_RECREATION", "OUTDOOR_RUGS", "OUTDOOR_SEATING", "OUTDOOR_STRUCTURES", "OUTDOOR_TABLES", "OUTERWEAR", "OVENS_AND_COOKTOPS", "OVERALLS", "OXFORDS_AND_LOAFERS", "PAINT_AND_PAINT_TOOLS", "PANTS", "PAPER_CRAFTS", "PARASOLS_AND_RAIN_UMBRELLAS", "PARTY_AND_CELEBRATION", "PENDANT_LIGHTS", "PENS_AND_PENCILS", "PERFUMES_AND_COLOGNES", "PET_CARRIERS_AND_CRATES", "PET_COLLARS_AND_HARNESSES", "PET_SUPPLIES", "PHOTO_ALBUMS_AND_STORAGE", "PICTURE_FRAMES", "PILLOWCASES_AND_SHAMS", "PINBACK_BUTTONS", "PLACEMATS", "PLANTS", "PONYTAIL_HOLDERS", "POOL_AND_SPA_ACCESSORIES", "POSTERS_PRINTS_AND_VISUAL_ARTWORK", "POTS_AND_PLANTERS", "POTTERY_AND_SCULPTING", "PRIMERS_AND_MAKEUP_SETTERS", "PUMPS", "PUZZLES", "QUILTS_AND_COMFORTERS", "RAZORS_AND_SHAVING_TOOLS", "RINGS", "RUGS", "RUNNER_RUGS", "SANDALS", "SASHES", "SAWS", "SCARVES_AND_SHAWLS", "SCULPTURES_AND_STATUES", "SEASONAL_AND_HOLIDAY_DECORATIONS", "SEATING", "SERUMS_AND_ESSENCES", "SERVEWARE", "SEWING_MACHINES", "SEWING_PATTERNS", "SHAMPOO_AND_CONDITIONER", "SHOE_ACCESSORIES", "SHOES", "SHOPPING_TOTES", "SHORTS", "SHOWER_CURTAINS", "SKINCARE", "SKINCARE_MASKS_AND_PEELS", "SKIRTS", "SLEEPWEAR_AND_LOUNGEWEAR", "SLIPCOVERS_AND_CUSHIONS", "SLIPPERS", "SNEAKERS_AND_ATHLETIC_SHOES", "SOCKS_AND_TIGHTS", "SOFAS", "SPORTS_UNIFORMS", "STEMWARE", "STOCKINGS", "STORAGE_AND_ORGANIZATION", "STORAGE_CABINETS_AND_LOCKERS", "STORAGE_HOOKS_AND_RACKS", "SUITCASES", "SUITS", "SUITS_AND_SUIT_SEPARATES", "GLASSES_AND_SUNGLASSES", "SUNSCREEN", "SWEATERS_AND_CARDIGANS", "SWEATSHIRTS_AND_HOODIES", "SWIMWEAR", "T_SHIRTS", "TABLE_LAMPS", "TABLE_RUNNERS", "TABLECLOTHS", "TABLES", "TABLEWARE", "TANK_TOPS", "TANNING_OILS_AND_LOTIONS", "TEETH_WHITENING", "TEETH_WHITENING_TOOLS", "TELEPHONY", "TEXTILE_AND_SEWING", "THREAD_AND_YARN", "THROW_PILLOWS", "TIARAS", "TOILET_PAPER_HOLDERS", "TONERS_AND_ASTRINGENTS", "TOOL_STORAGE_AND_ORGANIZATION", "TOOLS", "TOPS", "TOWEL_RACKS_AND_HOLDERS", "TOYS", "TRADITIONAL_AND_CEREMONIAL_CLOTHING", "TUMBLERS_AND_WATER_BOTTLES", "UNIFORMS", "VASES", "VEHICLE_PARTS_AND_ACCESSORIES", "VEILS", "WALL_CLOCKS", "WALL_LIGHT_FIXTURES", "WALL_PAINTS", "WALL_SHELVES_AND_LEDGES", "WALLETS_AND_CARD_CASES", "WALLPAPERS", "WATCHES", "WATERING_AND_IRRIGATION", "WEDDING_CEREMONY_DECOR", "WEDDING_CLOTHING", "WEDDING_DECOR", "WEDDING_DRESS", "WEDDING_GIFTS", "WEDDING_STATIONERY", "WEDDING_TABLE_DECOR", "WIGS_AND_HAIR_EXTENSIONS", "WINDOW_BLINDS_AND_SHADES", "WINDOW_TREATMENT_ACCESSORIES", "WINDOW_TREATMENTS", "WINE_RACKS", "WOOD_BOARDS_AND_PLANKS", "WOODWORKING_MATERIALS", "WOODWORKING_PLANS", "WORK_BENCHES", "WREATHS_AND_GARLANDS" };
    return valuesArray[values - 1];
}

pinterest_rest_api_catalogs_product_group_multiple_pinterest_product_category_criteria__e catalogs_product_group_multiple_pinterest_product_category_criteria_values_FromString(char* values) {
    int stringToReturn = 0;
    char *valuesArray[] =  { "NULL", "ACCENT_TABLES", "ACCESSORIES", "ANKLETS", "APRONS", "AREA_RUGS", "ARMOIRES_AND_WARDROBES", "ART_AND_CRAFT_PAINTS", "ART_BRUSHES", "ARTIFICIAL_FLORA", "ARTWORK", "AUDIO", "AUDIO_ACCESSORIES", "BACKPACKS", "BAG_AND_LUGGAGE_ACCESSORIES", "BAGS_AND_LUGGAGE", "BAKEWARE", "BANDANAS", "BAR_CARTS", "BARWARE", "BASKETS", "BATH_AND_BODY", "BATH_AND_SHOWER", "BATH_MATS_AND_RUGS", "BATH_TOWELS_AND_WASHCLOTHS", "BATHROOM_ACCESSORIES", "BATHROOM_ACCESSORY_SETS", "BATHROOM_VANITIES", "BEACH_TOWELS", "BEADS_AND_JEWELRY_MAKING_SUPPLIES", "BEAUTY_SUPPLEMENTS", "BED_SHEETS", "BEDDING", "BEDROOM_VANITIES", "BEDS_AND_ACCESSORIES", "BEDS_AND_BED_FRAMES", "BELT_BAGS", "BELTS_AND_SUSPENDERS", "BENCHES", "BEVERAGES", "BIRD_SUPPLIES", "BLANKETS", "BLOUSES", "BLUSHES_AND_BRONZERS", "BODY_CARE", "BODY_JEWELRY", "BODY_MAKEUP", "BODY_MOISTURIZERS", "BODY_WASHES", "BOOKCASES_AND_STANDING_SHELVES", "BOOKENDS", "BOOKS", "BOOTS", "BRACELETS", "BRIDESMAID_DRESSES", "BROOCHES_AND_LAPEL_PINS", "BROW_MAKEUP", "BUFFETS_AND_SIDEBOARDS", "BUTTON_DOWN_SHIRTS", "CABINET_HARDWARE", "CABINETS_AND_STORAGE_FURNITURE", "CAKE_DECORATING_SUPPLIES", "CAMPING_AND_HIKING", "CANDLE_HOLDERS", "CANDLES", "CARDSTOCK_PAPERS", "CASUAL_PANTS", "CAT_SUPPLIES", "CHAIRS", "CHANDELIERS", "CHARMS_AND_PENDANTS", "CHINA_CABINETS_AND_HUTCHES", "CLOGS_AND_MULES", "CLOTH_NAPKINS", "CLOTHING", "CLOTHING_AND_CLOSET_STORAGE", "CLOTHING_SETS", "COASTERS", "COATS_AND_JACKETS", "COFFEE_AND_TEA_CUPS", "COFFEE_MAKERS_AND_ESPRESSO_MACHINES", "COLORING_BOOKS", "COMMUNICATIONS", "COMPUTER_ACCESSORIES", "COOKIE_CUTTERS", "COOKWARE", "COOKWARE_AND_BAKEWARE", "COSMETIC_AND_TOILETRY_BAGS", "COSTUMES_AND_ACCESSORIES", "CRAFT_ADHESIVES_AND_MAGNETS", "CRAFT_CUTTING_TOOLS", "CRAFT_MOLDS", "CRIBS_AND_TODDLER_BEDS", "CURTAIN_AND_DRAPE_RODS", "CURTAINS_AND_DRAPES", "CUTTING_BOARDS", "CYCLING", "DECORATIVE_BOWLS", "DECORATIVE_JARS", "DECORATIVE_TAPESTRIES", "DECORATIVE_TRAYS", "DEODORANTS_AND_ANTIPERSPIRANTS", "DESK_AND_SHELF_CLOCKS", "DESKS", "DIAPER_BAGS", "DINNERWARE", "DISHWASHERS", "DOG_SUPPLIES", "DOOR_MATS", "DRAWING_AND_PAINTING", "DRESS_PANTS", "DRESSERS", "DRESSES", "DRILLS_AND_SCREWDRIVERS", "DRINKWARE", "DUFFEL_BAGS", "DUVET_COVERS", "DVDS_AND_VIDEOS", "EARRINGS", "ELECTRONICS_ACCESSORIES", "ENGAGEMENT_AND_WEDDING_RINGS", "ENTERTAINMENT_CENTERS_AND_TV_STANDS", "ERASERS", "EYE_MAKEUP", "EYE_SHADOW", "EYELINERS", "FABRIC", "FACE_COVERINGS", "FACE_LOTIONS_AND_CREAMS", "FACE_MAKEUP", "FACIAL_CLEANSERS", "FACIAL_MOISTURIZERS", "FALSE_EYELASHES", "FIGURINES", "FIREPLACE_AND_WOOD_STOVE_ACCESSORIES", "FIREPLACES", "FISHING", "FLAGS_AND_WINDSOCKS", "FLATS", "FLATWARE", "FLOOR_LAMPS", "FLOWER_GIRL_DRESSES", "FOOD_AND_BEVERAGE_CARRIERS", "FOOD_COOKERS_AND_STEAMERS", "FOOD_ITEMS", "FOOD_MIXERS_AND_BLENDERS", "FOOD_STORAGE_CONTAINERS", "FOOD_STORAGE_SUPPLIES", "FOUNDATIONS_AND_CONCEALERS", "FOUNTAINS_AND_PONDS", "FRAGRANCE", "FURNITURE", "FURNITURE_SETS", "GAMES", "GARDENING", "GARDENING_TOOLS", "GLOVES_AND_MITTENS", "GLUES_AND_TAPES", "GROOM_AND_GROOMSMEN_SUITS", "HAIR", "HAIR_ACCESSORIES", "HAIR_CARE", "HAIR_COLOR", "HAIR_COMBS", "HAIR_PINS_CLAWS_AND_CLIPS", "HAIR_REMOVAL", "HAIR_TOOLS", "HAIR_TREATMENT", "HAIR_WREATHS", "HAND_AND_FOOT_CARE", "HAND_SOAPS_AND_SANITIZERS", "HANDBAGS", "HANDKERCHIEFS", "HARDWARE_SUPPLIES", "HATS", "HEADBOARDS_AND_FOOTBOARDS", "HEADWEAR", "HIGHLIGHTERS", "HOBBIES_AND_CREATIVE_ARTS", "HOME_ACCESSORIES", "HOME_DECOR_DECALS", "HOME_FRAGRANCE_ACCESSORIES", "HOME_FRAGRANCES", "HOME_IMPROVEMENT_TOOLS_AND_SUPPLIES", "HOSIERY", "HOUSEHOLD_APPLIANCES", "HOUSEHOLD_SUPPLIES", "INCENSE", "INDOOR_GAMES", "JEANS", "JEWELRY_AND_WATCH_ACCESSORIES", "JEWELRY_AND_WATCHES", "JEWELRY_SETS", "JUMPSUITS_AND_ROMPERS", "KEYCHAINS", "KITCHEN_AND_DINING", "KITCHEN_AND_DINING_ROOM_TABLES", "KITCHEN_APPLIANCES", "KITCHEN_KNIVES", "KITCHEN_LINENS", "KITCHEN_MATS", "KITCHEN_ORGANIZERS", "KITCHEN_TOOLS_AND_UTENSILS", "KITCHEN_TOWELS", "KNITTING_AND_CROCHET", "KNITTING_AND_CROCHET_TOOLS", "LAMP_SHADES", "LAMPS", "LANYARDS", "LAUNDRY_HAMPERS_AND_SUPPLIES", "LAWN_AND_GARDEN", "LAWN_AND_GARDEN_DECOR", "LAWN_ORNAMENTS_AND_GARDEN_SCULPTURES", "LEGGINGS", "LEOTARDS_AND_UNITARDS", "LIGHTING", "LIGHTING_ACCESSORIES", "LIGHTING_FIXTURES", "LIP_BALMS", "LIP_CARE", "LIP_MAKEUP", "LIPSTICKS_AND_LIP_GLOSSES", "MAGAZINES_AND_NEWSPAPERS", "MAGNETS", "MAKEUP", "MAKEUP_TOOLS", "MASCARAS", "MATTRESSES", "MEASURES_AND_RULERS", "MEASURING_TOOLS_AND_SENSORS", "MESSENGER_BAGS", "MIRRORS", "MUSIC_AND_SOUND_RECORDINGS", "NAIL_ART", "NAIL_ART_KIT_AND_TOOLS", "NAIL_CARE", "NAIL_POLISHES", "NAILS", "NECKLACES", "NECKTIES", "NIGHT_LIGHTS_AND_AMBIENT_LIGHTING", "NIGHTSTANDS", "NOVELTY_SIGNS", "ONE_PIECES", "ONESIES", "OTTOMANS", "OUTDOOR_FURNITURE", "OUTDOOR_FURNITURE_SETS", "OUTDOOR_GAMES", "OUTDOOR_GRILLS", "OUTDOOR_LIVING", "OUTDOOR_PLAY_EQUIPMENT", "OUTDOOR_RECREATION", "OUTDOOR_RUGS", "OUTDOOR_SEATING", "OUTDOOR_STRUCTURES", "OUTDOOR_TABLES", "OUTERWEAR", "OVENS_AND_COOKTOPS", "OVERALLS", "OXFORDS_AND_LOAFERS", "PAINT_AND_PAINT_TOOLS", "PANTS", "PAPER_CRAFTS", "PARASOLS_AND_RAIN_UMBRELLAS", "PARTY_AND_CELEBRATION", "PENDANT_LIGHTS", "PENS_AND_PENCILS", "PERFUMES_AND_COLOGNES", "PET_CARRIERS_AND_CRATES", "PET_COLLARS_AND_HARNESSES", "PET_SUPPLIES", "PHOTO_ALBUMS_AND_STORAGE", "PICTURE_FRAMES", "PILLOWCASES_AND_SHAMS", "PINBACK_BUTTONS", "PLACEMATS", "PLANTS", "PONYTAIL_HOLDERS", "POOL_AND_SPA_ACCESSORIES", "POSTERS_PRINTS_AND_VISUAL_ARTWORK", "POTS_AND_PLANTERS", "POTTERY_AND_SCULPTING", "PRIMERS_AND_MAKEUP_SETTERS", "PUMPS", "PUZZLES", "QUILTS_AND_COMFORTERS", "RAZORS_AND_SHAVING_TOOLS", "RINGS", "RUGS", "RUNNER_RUGS", "SANDALS", "SASHES", "SAWS", "SCARVES_AND_SHAWLS", "SCULPTURES_AND_STATUES", "SEASONAL_AND_HOLIDAY_DECORATIONS", "SEATING", "SERUMS_AND_ESSENCES", "SERVEWARE", "SEWING_MACHINES", "SEWING_PATTERNS", "SHAMPOO_AND_CONDITIONER", "SHOE_ACCESSORIES", "SHOES", "SHOPPING_TOTES", "SHORTS", "SHOWER_CURTAINS", "SKINCARE", "SKINCARE_MASKS_AND_PEELS", "SKIRTS", "SLEEPWEAR_AND_LOUNGEWEAR", "SLIPCOVERS_AND_CUSHIONS", "SLIPPERS", "SNEAKERS_AND_ATHLETIC_SHOES", "SOCKS_AND_TIGHTS", "SOFAS", "SPORTS_UNIFORMS", "STEMWARE", "STOCKINGS", "STORAGE_AND_ORGANIZATION", "STORAGE_CABINETS_AND_LOCKERS", "STORAGE_HOOKS_AND_RACKS", "SUITCASES", "SUITS", "SUITS_AND_SUIT_SEPARATES", "GLASSES_AND_SUNGLASSES", "SUNSCREEN", "SWEATERS_AND_CARDIGANS", "SWEATSHIRTS_AND_HOODIES", "SWIMWEAR", "T_SHIRTS", "TABLE_LAMPS", "TABLE_RUNNERS", "TABLECLOTHS", "TABLES", "TABLEWARE", "TANK_TOPS", "TANNING_OILS_AND_LOTIONS", "TEETH_WHITENING", "TEETH_WHITENING_TOOLS", "TELEPHONY", "TEXTILE_AND_SEWING", "THREAD_AND_YARN", "THROW_PILLOWS", "TIARAS", "TOILET_PAPER_HOLDERS", "TONERS_AND_ASTRINGENTS", "TOOL_STORAGE_AND_ORGANIZATION", "TOOLS", "TOPS", "TOWEL_RACKS_AND_HOLDERS", "TOYS", "TRADITIONAL_AND_CEREMONIAL_CLOTHING", "TUMBLERS_AND_WATER_BOTTLES", "UNIFORMS", "VASES", "VEHICLE_PARTS_AND_ACCESSORIES", "VEILS", "WALL_CLOCKS", "WALL_LIGHT_FIXTURES", "WALL_PAINTS", "WALL_SHELVES_AND_LEDGES", "WALLETS_AND_CARD_CASES", "WALLPAPERS", "WATCHES", "WATERING_AND_IRRIGATION", "WEDDING_CEREMONY_DECOR", "WEDDING_CLOTHING", "WEDDING_DECOR", "WEDDING_DRESS", "WEDDING_GIFTS", "WEDDING_STATIONERY", "WEDDING_TABLE_DECOR", "WIGS_AND_HAIR_EXTENSIONS", "WINDOW_BLINDS_AND_SHADES", "WINDOW_TREATMENT_ACCESSORIES", "WINDOW_TREATMENTS", "WINE_RACKS", "WOOD_BOARDS_AND_PLANKS", "WOODWORKING_MATERIALS", "WOODWORKING_PLANS", "WORK_BENCHES", "WREATHS_AND_GARLANDS" };
    size_t sizeofArray = sizeof(valuesArray) / sizeof(valuesArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(values, valuesArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

static catalogs_product_group_multiple_pinterest_product_category_criteria_t *catalogs_product_group_multiple_pinterest_product_category_criteria_create_internal(
    int *negated,
    list_t *values
    ) {
    catalogs_product_group_multiple_pinterest_product_category_criteria_t *catalogs_product_group_multiple_pinterest_product_category_criteria_local_var = malloc(sizeof(catalogs_product_group_multiple_pinterest_product_category_criteria_t));
    if (!catalogs_product_group_multiple_pinterest_product_category_criteria_local_var) {
        return NULL;
    }
    memset(catalogs_product_group_multiple_pinterest_product_category_criteria_local_var, 0, sizeof(catalogs_product_group_multiple_pinterest_product_category_criteria_t));
    catalogs_product_group_multiple_pinterest_product_category_criteria_local_var->_library_owned = 1;
    catalogs_product_group_multiple_pinterest_product_category_criteria_local_var->negated = negated;
    catalogs_product_group_multiple_pinterest_product_category_criteria_local_var->values = values;
    return catalogs_product_group_multiple_pinterest_product_category_criteria_local_var;
}

__attribute__((deprecated)) catalogs_product_group_multiple_pinterest_product_category_criteria_t *catalogs_product_group_multiple_pinterest_product_category_criteria_create(
    int *negated,
    list_t *values
    ) {
    int *negated_copy = NULL;
    if (negated) {
        negated_copy = malloc(sizeof(int));
        if (negated_copy) *negated_copy = *negated;
    }
    catalogs_product_group_multiple_pinterest_product_category_criteria_t *result = catalogs_product_group_multiple_pinterest_product_category_criteria_create_internal (
        negated_copy,
        values
        );
    if (!result) {
        free(negated_copy);
    }
    return result;
}

void catalogs_product_group_multiple_pinterest_product_category_criteria_free(catalogs_product_group_multiple_pinterest_product_category_criteria_t *catalogs_product_group_multiple_pinterest_product_category_criteria) {
    if(NULL == catalogs_product_group_multiple_pinterest_product_category_criteria){
        return ;
    }
    if(catalogs_product_group_multiple_pinterest_product_category_criteria->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "catalogs_product_group_multiple_pinterest_product_category_criteria_free");
        return ;
    }
    listEntry_t *listEntry;
    if (catalogs_product_group_multiple_pinterest_product_category_criteria->negated) {
        free(catalogs_product_group_multiple_pinterest_product_category_criteria->negated);
        catalogs_product_group_multiple_pinterest_product_category_criteria->negated = NULL;
    }
    if (catalogs_product_group_multiple_pinterest_product_category_criteria->values) {
        list_ForEach(listEntry, catalogs_product_group_multiple_pinterest_product_category_criteria->values) {
            product_category_enum_free(listEntry->data);
        }
        list_freeList(catalogs_product_group_multiple_pinterest_product_category_criteria->values);
        catalogs_product_group_multiple_pinterest_product_category_criteria->values = NULL;
    }
    free(catalogs_product_group_multiple_pinterest_product_category_criteria);
}

cJSON *catalogs_product_group_multiple_pinterest_product_category_criteria_convertToJSON(catalogs_product_group_multiple_pinterest_product_category_criteria_t *catalogs_product_group_multiple_pinterest_product_category_criteria) {
    cJSON *item = cJSON_CreateObject();

    // catalogs_product_group_multiple_pinterest_product_category_criteria->negated
    if(catalogs_product_group_multiple_pinterest_product_category_criteria->negated) {
    if(cJSON_AddBoolToObject(item, "negated", *catalogs_product_group_multiple_pinterest_product_category_criteria->negated) == NULL) {
    goto fail; //Bool
    }
    }


    // catalogs_product_group_multiple_pinterest_product_category_criteria->values
    if (pinterest_rest_api_list_VALUES_NULL == catalogs_product_group_multiple_pinterest_product_category_criteria->values) {
        goto fail;
    }
    cJSON *values = cJSON_AddArrayToObject(item, "values");
    if(values == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *valuesListEntry;
    if (catalogs_product_group_multiple_pinterest_product_category_criteria->values) {
    list_ForEach(valuesListEntry, catalogs_product_group_multiple_pinterest_product_category_criteria->values) {
    cJSON *itemLocal = product_category_enum_convertToJSON((pinterest_rest_api_catalogs_product_group_multiple_pinterest_product_category_criteria__e)valuesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(values, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

catalogs_product_group_multiple_pinterest_product_category_criteria_t *catalogs_product_group_multiple_pinterest_product_category_criteria_parseFromJSON(cJSON *catalogs_product_group_multiple_pinterest_product_category_criteriaJSON){

    catalogs_product_group_multiple_pinterest_product_category_criteria_t *catalogs_product_group_multiple_pinterest_product_category_criteria_local_var = NULL;

    // define the local variable for catalogs_product_group_multiple_pinterest_product_category_criteria->negated
    int *negated_local_var = NULL;

    // define the local list for catalogs_product_group_multiple_pinterest_product_category_criteria->values
    list_t *valuesList = NULL;

    // catalogs_product_group_multiple_pinterest_product_category_criteria->negated
    cJSON *negated = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_multiple_pinterest_product_category_criteriaJSON, "negated");
    if (cJSON_IsNull(negated)) {
        negated = NULL;
    }
    if (negated) { 
    if(!cJSON_IsBool(negated))
    {
    goto end; //Bool
    }
    negated_local_var = malloc(sizeof(int));
    if(!negated_local_var)
    {
        goto end;
    }
    *negated_local_var = negated->valueint;
    }

    // catalogs_product_group_multiple_pinterest_product_category_criteria->values
    cJSON *values = cJSON_GetObjectItemCaseSensitive(catalogs_product_group_multiple_pinterest_product_category_criteriaJSON, "values");
    if (cJSON_IsNull(values)) {
        values = NULL;
    }
    if (!values) {
        goto end;
    }

    
    cJSON *values_local_nonprimitive = NULL;
    if(!cJSON_IsArray(values)){
        goto end; //nonprimitive container
    }

    valuesList = list_createList();

    cJSON_ArrayForEach(values_local_nonprimitive,values )
    {
        if(!cJSON_IsObject(values_local_nonprimitive)){
            goto end;
        }
        catalogs_product_group_multiple_pinterest_product_category_criteria_product_category_enum_e valuesItem = product_category_enum_parseFromJSON(values_local_nonprimitive);

        list_addElement(valuesList, (void *)valuesItem);
    }



    catalogs_product_group_multiple_pinterest_product_category_criteria_local_var = catalogs_product_group_multiple_pinterest_product_category_criteria_create_internal (
        negated_local_var,
        valuesList
        );

    if (!catalogs_product_group_multiple_pinterest_product_category_criteria_local_var) {
        goto end;
    }

    return catalogs_product_group_multiple_pinterest_product_category_criteria_local_var;
end:
    if (negated_local_var) {
        free(negated_local_var);
        negated_local_var = NULL;
    }
    if (valuesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, valuesList) {
            product_category_enum_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(valuesList);
        valuesList = NULL;
    }
    return NULL;

}
