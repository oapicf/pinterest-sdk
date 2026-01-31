#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>

#include "ProductCategoriesAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define MAX_NUMBER_LENGTH_LONG 21

// Functions for enum  for ProductCategoriesAPI_trendsFeaturedTopicsList

static char* trendsFeaturedTopicsList__ToString(pinterest_rest_api_trendsFeaturedTopicsList_region_e ){
    char *Array[] =  { "NULL", "US", "GB+IE", "CA" };
    return Array[];
}

static pinterest_rest_api_trendsFeaturedTopicsList_region_e trendsFeaturedTopicsList__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "US", "GB+IE", "CA" };
    size_t sizeofArray = sizeof(Array) / sizeof(Array[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(, Array[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function trendsFeaturedTopicsList__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *trendsFeaturedTopicsList__convertToJSON(pinterest_rest_api_trendsFeaturedTopicsList_region_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function trendsFeaturedTopicsList__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_trendsFeaturedTopicsList_region_e trendsFeaturedTopicsList__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_trendsFeaturedTopicsList_region_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for ProductCategoriesAPI_trendsFeaturedTopicsList

static char* trendsFeaturedTopicsList__ToString(pinterest_rest_api_trendsFeaturedTopicsList_interest_e ){
    char *Array[] =  { "NULL", "ALL", "ANIMALS", "ARCHITECTURE", "ART", "BEAUTY", "DIY_AND_CRAFTS", "EDUCATION", "EVENT_PLANNING", "FASHION", "FOOD_AND_DRINKS", "GARDENING", "HEALTH", "HOME_DECOR", "PARENTING", "TRAVEL", "WEDDING" };
    return Array[];
}

static pinterest_rest_api_trendsFeaturedTopicsList_interest_e trendsFeaturedTopicsList__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "ALL", "ANIMALS", "ARCHITECTURE", "ART", "BEAUTY", "DIY_AND_CRAFTS", "EDUCATION", "EVENT_PLANNING", "FASHION", "FOOD_AND_DRINKS", "GARDENING", "HEALTH", "HOME_DECOR", "PARENTING", "TRAVEL", "WEDDING" };
    size_t sizeofArray = sizeof(Array) / sizeof(Array[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(, Array[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function trendsFeaturedTopicsList__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *trendsFeaturedTopicsList__convertToJSON(pinterest_rest_api_trendsFeaturedTopicsList_interest_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function trendsFeaturedTopicsList__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_trendsFeaturedTopicsList_interest_e trendsFeaturedTopicsList__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_trendsFeaturedTopicsList_interest_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum PRODUCTCATEGORIES for ProductCategoriesAPI_trendsProductCategoriesDetailsList

static char* trendsProductCategoriesDetailsList_PRODUCTCATEGORIES_ToString(pinterest_rest_api_trendsProductCategoriesDetailsList_product_categories_e PRODUCTCATEGORIES){
    char *PRODUCTCATEGORIESArray[] =  { "NULL", "ACCENT_TABLES", "ACCESSORIES", "ANKLETS", "APRONS", "AREA_RUGS", "ARMOIRES_AND_WARDROBES", "ART_AND_CRAFT_PAINTS", "ART_BRUSHES", "ARTIFICIAL_FLORA", "ARTWORK", "AUDIO", "AUDIO_ACCESSORIES", "BACKPACKS", "BAG_AND_LUGGAGE_ACCESSORIES", "BAGS_AND_LUGGAGE", "BAKEWARE", "BANDANAS", "BAR_CARTS", "BARWARE", "BASKETS", "BATH_AND_BODY", "BATH_AND_SHOWER", "BATH_MATS_AND_RUGS", "BATH_TOWELS_AND_WASHCLOTHS", "BATHROOM_ACCESSORIES", "BATHROOM_ACCESSORY_SETS", "BATHROOM_VANITIES", "BEACH_TOWELS", "BEADS_AND_JEWELRY_MAKING_SUPPLIES", "BEAUTY_SUPPLEMENTS", "BED_SHEETS", "BEDDING", "BEDROOM_VANITIES", "BEDS_AND_ACCESSORIES", "BEDS_AND_BED_FRAMES", "BELT_BAGS", "BELTS_AND_SUSPENDERS", "BENCHES", "BEVERAGES", "BIRD_SUPPLIES", "BLANKETS", "BLOUSES", "BLUSHES_AND_BRONZERS", "BODY_CARE", "BODY_JEWELRY", "BODY_MAKEUP", "BODY_MOISTURIZERS", "BODY_WASHES", "BOOKCASES_AND_STANDING_SHELVES", "BOOKENDS", "BOOKS", "BOOTS", "BRACELETS", "BRIDESMAID_DRESSES", "BROOCHES_AND_LAPEL_PINS", "BROW_MAKEUP", "BUFFETS_AND_SIDEBOARDS", "BUTTON_DOWN_SHIRTS", "CABINET_HARDWARE", "CABINETS_AND_STORAGE_FURNITURE", "CAKE_DECORATING_SUPPLIES", "CAMPING_AND_HIKING", "CANDLE_HOLDERS", "CANDLES", "CARDSTOCK_PAPERS", "CASUAL_PANTS", "CAT_SUPPLIES", "CHAIRS", "CHANDELIERS", "CHARMS_AND_PENDANTS", "CHINA_CABINETS_AND_HUTCHES", "CLOGS_AND_MULES", "CLOTH_NAPKINS", "CLOTHING", "CLOTHING_AND_CLOSET_STORAGE", "CLOTHING_SETS", "COASTERS", "COATS_AND_JACKETS", "COFFEE_AND_TEA_CUPS", "COFFEE_MAKERS_AND_ESPRESSO_MACHINES", "COLORING_BOOKS", "COMMUNICATIONS", "COMPUTER_ACCESSORIES", "COOKIE_CUTTERS", "COOKWARE", "COOKWARE_AND_BAKEWARE", "COSMETIC_AND_TOILETRY_BAGS", "COSTUMES_AND_ACCESSORIES", "CRAFT_ADHESIVES_AND_MAGNETS", "CRAFT_CUTTING_TOOLS", "CRAFT_MOLDS", "CRIBS_AND_TODDLER_BEDS", "CURTAIN_AND_DRAPE_RODS", "CURTAINS_AND_DRAPES", "CUTTING_BOARDS", "CYCLING", "DECORATIVE_BOWLS", "DECORATIVE_JARS", "DECORATIVE_TAPESTRIES", "DECORATIVE_TRAYS", "DEODORANTS_AND_ANTIPERSPIRANTS", "DESK_AND_SHELF_CLOCKS", "DESKS", "DIAPER_BAGS", "DINNERWARE", "DISHWASHERS", "DOG_SUPPLIES", "DOOR_MATS", "DRAWING_AND_PAINTING", "DRESS_PANTS", "DRESSERS", "DRESSES", "DRILLS_AND_SCREWDRIVERS", "DRINKWARE", "DUFFEL_BAGS", "DUVET_COVERS", "DVDS_AND_VIDEOS", "EARRINGS", "ELECTRONICS_ACCESSORIES", "ENGAGEMENT_AND_WEDDING_RINGS", "ENTERTAINMENT_CENTERS_AND_TV_STANDS", "ERASERS", "EYE_MAKEUP", "EYE_SHADOW", "EYELINERS", "FABRIC", "FACE_COVERINGS", "FACE_LOTIONS_AND_CREAMS", "FACE_MAKEUP", "FACIAL_CLEANSERS", "FACIAL_MOISTURIZERS", "FALSE_EYELASHES", "FIGURINES", "FIREPLACE_AND_WOOD_STOVE_ACCESSORIES", "FIREPLACES", "FISHING", "FLAGS_AND_WINDSOCKS", "FLATS", "FLATWARE", "FLOOR_LAMPS", "FLOWER_GIRL_DRESSES", "FOOD_AND_BEVERAGE_CARRIERS", "FOOD_COOKERS_AND_STEAMERS", "FOOD_ITEMS", "FOOD_MIXERS_AND_BLENDERS", "FOOD_STORAGE_CONTAINERS", "FOOD_STORAGE_SUPPLIES", "FOUNDATIONS_AND_CONCEALERS", "FOUNTAINS_AND_PONDS", "FRAGRANCE", "FURNITURE", "FURNITURE_SETS", "GAMES", "GARDENING", "GARDENING_TOOLS", "GLOVES_AND_MITTENS", "GLUES_AND_TAPES", "GROOM_AND_GROOMSMEN_SUITS", "HAIR", "HAIR_ACCESSORIES", "HAIR_CARE", "HAIR_COLOR", "HAIR_COMBS", "HAIR_PINS_CLAWS_AND_CLIPS", "HAIR_REMOVAL", "HAIR_TOOLS", "HAIR_TREATMENT", "HAIR_WREATHS", "HAND_AND_FOOT_CARE", "HAND_SOAPS_AND_SANITIZERS", "HANDBAGS", "HANDKERCHIEFS", "HARDWARE_SUPPLIES", "HATS", "HEADBOARDS_AND_FOOTBOARDS", "HEADWEAR", "HIGHLIGHTERS", "HOBBIES_AND_CREATIVE_ARTS", "HOME_ACCESSORIES", "HOME_DECOR_DECALS", "HOME_FRAGRANCE_ACCESSORIES", "HOME_FRAGRANCES", "HOME_IMPROVEMENT_TOOLS_AND_SUPPLIES", "HOSIERY", "HOUSEHOLD_APPLIANCES", "HOUSEHOLD_SUPPLIES", "INCENSE", "INDOOR_GAMES", "JEANS", "JEWELRY_AND_WATCH_ACCESSORIES", "JEWELRY_AND_WATCHES", "JEWELRY_SETS", "JUMPSUITS_AND_ROMPERS", "KEYCHAINS", "KITCHEN_AND_DINING", "KITCHEN_AND_DINING_ROOM_TABLES", "KITCHEN_APPLIANCES", "KITCHEN_KNIVES", "KITCHEN_LINENS", "KITCHEN_MATS", "KITCHEN_ORGANIZERS", "KITCHEN_TOOLS_AND_UTENSILS", "KITCHEN_TOWELS", "KNITTING_AND_CROCHET", "KNITTING_AND_CROCHET_TOOLS", "LAMP_SHADES", "LAMPS", "LANYARDS", "LAUNDRY_HAMPERS_AND_SUPPLIES", "LAWN_AND_GARDEN", "LAWN_AND_GARDEN_DECOR", "LAWN_ORNAMENTS_AND_GARDEN_SCULPTURES", "LEGGINGS", "LEOTARDS_AND_UNITARDS", "LIGHTING", "LIGHTING_ACCESSORIES", "LIGHTING_FIXTURES", "LIP_BALMS", "LIP_CARE", "LIP_MAKEUP", "LIPSTICKS_AND_LIP_GLOSSES", "MAGAZINES_AND_NEWSPAPERS", "MAGNETS", "MAKEUP", "MAKEUP_TOOLS", "MASCARAS", "MATTRESSES", "MEASURES_AND_RULERS", "MEASURING_TOOLS_AND_SENSORS", "MESSENGER_BAGS", "MIRRORS", "MUSIC_AND_SOUND_RECORDINGS", "NAIL_ART", "NAIL_ART_KIT_AND_TOOLS", "NAIL_CARE", "NAIL_POLISHES", "NAILS", "NECKLACES", "NECKTIES", "NIGHT_LIGHTS_AND_AMBIENT_LIGHTING", "NIGHTSTANDS", "NOVELTY_SIGNS", "ONE_PIECES", "ONESIES", "OTTOMANS", "OUTDOOR_FURNITURE", "OUTDOOR_FURNITURE_SETS", "OUTDOOR_GAMES", "OUTDOOR_GRILLS", "OUTDOOR_LIVING", "OUTDOOR_PLAY_EQUIPMENT", "OUTDOOR_RECREATION", "OUTDOOR_RUGS", "OUTDOOR_SEATING", "OUTDOOR_STRUCTURES", "OUTDOOR_TABLES", "OUTERWEAR", "OVENS_AND_COOKTOPS", "OVERALLS", "OXFORDS_AND_LOAFERS", "PAINT_AND_PAINT_TOOLS", "PANTS", "PAPER_CRAFTS", "PARASOLS_AND_RAIN_UMBRELLAS", "PARTY_AND_CELEBRATION", "PENDANT_LIGHTS", "PENS_AND_PENCILS", "PERFUMES_AND_COLOGNES", "PET_CARRIERS_AND_CRATES", "PET_COLLARS_AND_HARNESSES", "PET_SUPPLIES", "PHOTO_ALBUMS_AND_STORAGE", "PICTURE_FRAMES", "PILLOWCASES_AND_SHAMS", "PINBACK_BUTTONS", "PLACEMATS", "PLANTS", "PONYTAIL_HOLDERS", "POOL_AND_SPA_ACCESSORIES", "POSTERS_PRINTS_AND_VISUAL_ARTWORK", "POTS_AND_PLANTERS", "POTTERY_AND_SCULPTING", "PRIMERS_AND_MAKEUP_SETTERS", "PUMPS", "PUZZLES", "QUILTS_AND_COMFORTERS", "RAZORS_AND_SHAVING_TOOLS", "RINGS", "RUGS", "RUNNER_RUGS", "SANDALS", "SASHES", "SAWS", "SCARVES_AND_SHAWLS", "SCULPTURES_AND_STATUES", "SEASONAL_AND_HOLIDAY_DECORATIONS", "SEATING", "SERUMS_AND_ESSENCES", "SERVEWARE", "SEWING_MACHINES", "SEWING_PATTERNS", "SHAMPOO_AND_CONDITIONER", "SHOE_ACCESSORIES", "SHOES", "SHOPPING_TOTES", "SHORTS", "SHOWER_CURTAINS", "SKINCARE", "SKINCARE_MASKS_AND_PEELS", "SKIRTS", "SLEEPWEAR_AND_LOUNGEWEAR", "SLIPCOVERS_AND_CUSHIONS", "SLIPPERS", "SNEAKERS_AND_ATHLETIC_SHOES", "SOCKS_AND_TIGHTS", "SOFAS", "SPORTS_UNIFORMS", "STEMWARE", "STOCKINGS", "STORAGE_AND_ORGANIZATION", "STORAGE_CABINETS_AND_LOCKERS", "STORAGE_HOOKS_AND_RACKS", "SUITCASES", "SUITS", "SUITS_AND_SUIT_SEPARATES", "GLASSES_AND_SUNGLASSES", "SUNSCREEN", "SWEATERS_AND_CARDIGANS", "SWEATSHIRTS_AND_HOODIES", "SWIMWEAR", "T_SHIRTS", "TABLE_LAMPS", "TABLE_RUNNERS", "TABLECLOTHS", "TABLES", "TABLEWARE", "TANK_TOPS", "TANNING_OILS_AND_LOTIONS", "TEETH_WHITENING", "TEETH_WHITENING_TOOLS", "TELEPHONY", "TEXTILE_AND_SEWING", "THREAD_AND_YARN", "THROW_PILLOWS", "TIARAS", "TOILET_PAPER_HOLDERS", "TONERS_AND_ASTRINGENTS", "TOOL_STORAGE_AND_ORGANIZATION", "TOOLS", "TOPS", "TOWEL_RACKS_AND_HOLDERS", "TOYS", "TRADITIONAL_AND_CEREMONIAL_CLOTHING", "TUMBLERS_AND_WATER_BOTTLES", "UNIFORMS", "VASES", "VEHICLE_PARTS_AND_ACCESSORIES", "VEILS", "WALL_CLOCKS", "WALL_LIGHT_FIXTURES", "WALL_PAINTS", "WALL_SHELVES_AND_LEDGES", "WALLETS_AND_CARD_CASES", "WALLPAPERS", "WATCHES", "WATERING_AND_IRRIGATION", "WEDDING_CEREMONY_DECOR", "WEDDING_CLOTHING", "WEDDING_DECOR", "WEDDING_DRESS", "WEDDING_GIFTS", "WEDDING_STATIONERY", "WEDDING_TABLE_DECOR", "WIGS_AND_HAIR_EXTENSIONS", "WINDOW_BLINDS_AND_SHADES", "WINDOW_TREATMENT_ACCESSORIES", "WINDOW_TREATMENTS", "WINE_RACKS", "WOOD_BOARDS_AND_PLANKS", "WOODWORKING_MATERIALS", "WOODWORKING_PLANS", "WORK_BENCHES", "WREATHS_AND_GARLANDS" };
    return PRODUCTCATEGORIESArray[PRODUCTCATEGORIES];
}

static pinterest_rest_api_trendsProductCategoriesDetailsList_product_categories_e trendsProductCategoriesDetailsList_PRODUCTCATEGORIES_FromString(char* PRODUCTCATEGORIES){
    int stringToReturn = 0;
    char *PRODUCTCATEGORIESArray[] =  { "NULL", "ACCENT_TABLES", "ACCESSORIES", "ANKLETS", "APRONS", "AREA_RUGS", "ARMOIRES_AND_WARDROBES", "ART_AND_CRAFT_PAINTS", "ART_BRUSHES", "ARTIFICIAL_FLORA", "ARTWORK", "AUDIO", "AUDIO_ACCESSORIES", "BACKPACKS", "BAG_AND_LUGGAGE_ACCESSORIES", "BAGS_AND_LUGGAGE", "BAKEWARE", "BANDANAS", "BAR_CARTS", "BARWARE", "BASKETS", "BATH_AND_BODY", "BATH_AND_SHOWER", "BATH_MATS_AND_RUGS", "BATH_TOWELS_AND_WASHCLOTHS", "BATHROOM_ACCESSORIES", "BATHROOM_ACCESSORY_SETS", "BATHROOM_VANITIES", "BEACH_TOWELS", "BEADS_AND_JEWELRY_MAKING_SUPPLIES", "BEAUTY_SUPPLEMENTS", "BED_SHEETS", "BEDDING", "BEDROOM_VANITIES", "BEDS_AND_ACCESSORIES", "BEDS_AND_BED_FRAMES", "BELT_BAGS", "BELTS_AND_SUSPENDERS", "BENCHES", "BEVERAGES", "BIRD_SUPPLIES", "BLANKETS", "BLOUSES", "BLUSHES_AND_BRONZERS", "BODY_CARE", "BODY_JEWELRY", "BODY_MAKEUP", "BODY_MOISTURIZERS", "BODY_WASHES", "BOOKCASES_AND_STANDING_SHELVES", "BOOKENDS", "BOOKS", "BOOTS", "BRACELETS", "BRIDESMAID_DRESSES", "BROOCHES_AND_LAPEL_PINS", "BROW_MAKEUP", "BUFFETS_AND_SIDEBOARDS", "BUTTON_DOWN_SHIRTS", "CABINET_HARDWARE", "CABINETS_AND_STORAGE_FURNITURE", "CAKE_DECORATING_SUPPLIES", "CAMPING_AND_HIKING", "CANDLE_HOLDERS", "CANDLES", "CARDSTOCK_PAPERS", "CASUAL_PANTS", "CAT_SUPPLIES", "CHAIRS", "CHANDELIERS", "CHARMS_AND_PENDANTS", "CHINA_CABINETS_AND_HUTCHES", "CLOGS_AND_MULES", "CLOTH_NAPKINS", "CLOTHING", "CLOTHING_AND_CLOSET_STORAGE", "CLOTHING_SETS", "COASTERS", "COATS_AND_JACKETS", "COFFEE_AND_TEA_CUPS", "COFFEE_MAKERS_AND_ESPRESSO_MACHINES", "COLORING_BOOKS", "COMMUNICATIONS", "COMPUTER_ACCESSORIES", "COOKIE_CUTTERS", "COOKWARE", "COOKWARE_AND_BAKEWARE", "COSMETIC_AND_TOILETRY_BAGS", "COSTUMES_AND_ACCESSORIES", "CRAFT_ADHESIVES_AND_MAGNETS", "CRAFT_CUTTING_TOOLS", "CRAFT_MOLDS", "CRIBS_AND_TODDLER_BEDS", "CURTAIN_AND_DRAPE_RODS", "CURTAINS_AND_DRAPES", "CUTTING_BOARDS", "CYCLING", "DECORATIVE_BOWLS", "DECORATIVE_JARS", "DECORATIVE_TAPESTRIES", "DECORATIVE_TRAYS", "DEODORANTS_AND_ANTIPERSPIRANTS", "DESK_AND_SHELF_CLOCKS", "DESKS", "DIAPER_BAGS", "DINNERWARE", "DISHWASHERS", "DOG_SUPPLIES", "DOOR_MATS", "DRAWING_AND_PAINTING", "DRESS_PANTS", "DRESSERS", "DRESSES", "DRILLS_AND_SCREWDRIVERS", "DRINKWARE", "DUFFEL_BAGS", "DUVET_COVERS", "DVDS_AND_VIDEOS", "EARRINGS", "ELECTRONICS_ACCESSORIES", "ENGAGEMENT_AND_WEDDING_RINGS", "ENTERTAINMENT_CENTERS_AND_TV_STANDS", "ERASERS", "EYE_MAKEUP", "EYE_SHADOW", "EYELINERS", "FABRIC", "FACE_COVERINGS", "FACE_LOTIONS_AND_CREAMS", "FACE_MAKEUP", "FACIAL_CLEANSERS", "FACIAL_MOISTURIZERS", "FALSE_EYELASHES", "FIGURINES", "FIREPLACE_AND_WOOD_STOVE_ACCESSORIES", "FIREPLACES", "FISHING", "FLAGS_AND_WINDSOCKS", "FLATS", "FLATWARE", "FLOOR_LAMPS", "FLOWER_GIRL_DRESSES", "FOOD_AND_BEVERAGE_CARRIERS", "FOOD_COOKERS_AND_STEAMERS", "FOOD_ITEMS", "FOOD_MIXERS_AND_BLENDERS", "FOOD_STORAGE_CONTAINERS", "FOOD_STORAGE_SUPPLIES", "FOUNDATIONS_AND_CONCEALERS", "FOUNTAINS_AND_PONDS", "FRAGRANCE", "FURNITURE", "FURNITURE_SETS", "GAMES", "GARDENING", "GARDENING_TOOLS", "GLOVES_AND_MITTENS", "GLUES_AND_TAPES", "GROOM_AND_GROOMSMEN_SUITS", "HAIR", "HAIR_ACCESSORIES", "HAIR_CARE", "HAIR_COLOR", "HAIR_COMBS", "HAIR_PINS_CLAWS_AND_CLIPS", "HAIR_REMOVAL", "HAIR_TOOLS", "HAIR_TREATMENT", "HAIR_WREATHS", "HAND_AND_FOOT_CARE", "HAND_SOAPS_AND_SANITIZERS", "HANDBAGS", "HANDKERCHIEFS", "HARDWARE_SUPPLIES", "HATS", "HEADBOARDS_AND_FOOTBOARDS", "HEADWEAR", "HIGHLIGHTERS", "HOBBIES_AND_CREATIVE_ARTS", "HOME_ACCESSORIES", "HOME_DECOR_DECALS", "HOME_FRAGRANCE_ACCESSORIES", "HOME_FRAGRANCES", "HOME_IMPROVEMENT_TOOLS_AND_SUPPLIES", "HOSIERY", "HOUSEHOLD_APPLIANCES", "HOUSEHOLD_SUPPLIES", "INCENSE", "INDOOR_GAMES", "JEANS", "JEWELRY_AND_WATCH_ACCESSORIES", "JEWELRY_AND_WATCHES", "JEWELRY_SETS", "JUMPSUITS_AND_ROMPERS", "KEYCHAINS", "KITCHEN_AND_DINING", "KITCHEN_AND_DINING_ROOM_TABLES", "KITCHEN_APPLIANCES", "KITCHEN_KNIVES", "KITCHEN_LINENS", "KITCHEN_MATS", "KITCHEN_ORGANIZERS", "KITCHEN_TOOLS_AND_UTENSILS", "KITCHEN_TOWELS", "KNITTING_AND_CROCHET", "KNITTING_AND_CROCHET_TOOLS", "LAMP_SHADES", "LAMPS", "LANYARDS", "LAUNDRY_HAMPERS_AND_SUPPLIES", "LAWN_AND_GARDEN", "LAWN_AND_GARDEN_DECOR", "LAWN_ORNAMENTS_AND_GARDEN_SCULPTURES", "LEGGINGS", "LEOTARDS_AND_UNITARDS", "LIGHTING", "LIGHTING_ACCESSORIES", "LIGHTING_FIXTURES", "LIP_BALMS", "LIP_CARE", "LIP_MAKEUP", "LIPSTICKS_AND_LIP_GLOSSES", "MAGAZINES_AND_NEWSPAPERS", "MAGNETS", "MAKEUP", "MAKEUP_TOOLS", "MASCARAS", "MATTRESSES", "MEASURES_AND_RULERS", "MEASURING_TOOLS_AND_SENSORS", "MESSENGER_BAGS", "MIRRORS", "MUSIC_AND_SOUND_RECORDINGS", "NAIL_ART", "NAIL_ART_KIT_AND_TOOLS", "NAIL_CARE", "NAIL_POLISHES", "NAILS", "NECKLACES", "NECKTIES", "NIGHT_LIGHTS_AND_AMBIENT_LIGHTING", "NIGHTSTANDS", "NOVELTY_SIGNS", "ONE_PIECES", "ONESIES", "OTTOMANS", "OUTDOOR_FURNITURE", "OUTDOOR_FURNITURE_SETS", "OUTDOOR_GAMES", "OUTDOOR_GRILLS", "OUTDOOR_LIVING", "OUTDOOR_PLAY_EQUIPMENT", "OUTDOOR_RECREATION", "OUTDOOR_RUGS", "OUTDOOR_SEATING", "OUTDOOR_STRUCTURES", "OUTDOOR_TABLES", "OUTERWEAR", "OVENS_AND_COOKTOPS", "OVERALLS", "OXFORDS_AND_LOAFERS", "PAINT_AND_PAINT_TOOLS", "PANTS", "PAPER_CRAFTS", "PARASOLS_AND_RAIN_UMBRELLAS", "PARTY_AND_CELEBRATION", "PENDANT_LIGHTS", "PENS_AND_PENCILS", "PERFUMES_AND_COLOGNES", "PET_CARRIERS_AND_CRATES", "PET_COLLARS_AND_HARNESSES", "PET_SUPPLIES", "PHOTO_ALBUMS_AND_STORAGE", "PICTURE_FRAMES", "PILLOWCASES_AND_SHAMS", "PINBACK_BUTTONS", "PLACEMATS", "PLANTS", "PONYTAIL_HOLDERS", "POOL_AND_SPA_ACCESSORIES", "POSTERS_PRINTS_AND_VISUAL_ARTWORK", "POTS_AND_PLANTERS", "POTTERY_AND_SCULPTING", "PRIMERS_AND_MAKEUP_SETTERS", "PUMPS", "PUZZLES", "QUILTS_AND_COMFORTERS", "RAZORS_AND_SHAVING_TOOLS", "RINGS", "RUGS", "RUNNER_RUGS", "SANDALS", "SASHES", "SAWS", "SCARVES_AND_SHAWLS", "SCULPTURES_AND_STATUES", "SEASONAL_AND_HOLIDAY_DECORATIONS", "SEATING", "SERUMS_AND_ESSENCES", "SERVEWARE", "SEWING_MACHINES", "SEWING_PATTERNS", "SHAMPOO_AND_CONDITIONER", "SHOE_ACCESSORIES", "SHOES", "SHOPPING_TOTES", "SHORTS", "SHOWER_CURTAINS", "SKINCARE", "SKINCARE_MASKS_AND_PEELS", "SKIRTS", "SLEEPWEAR_AND_LOUNGEWEAR", "SLIPCOVERS_AND_CUSHIONS", "SLIPPERS", "SNEAKERS_AND_ATHLETIC_SHOES", "SOCKS_AND_TIGHTS", "SOFAS", "SPORTS_UNIFORMS", "STEMWARE", "STOCKINGS", "STORAGE_AND_ORGANIZATION", "STORAGE_CABINETS_AND_LOCKERS", "STORAGE_HOOKS_AND_RACKS", "SUITCASES", "SUITS", "SUITS_AND_SUIT_SEPARATES", "GLASSES_AND_SUNGLASSES", "SUNSCREEN", "SWEATERS_AND_CARDIGANS", "SWEATSHIRTS_AND_HOODIES", "SWIMWEAR", "T_SHIRTS", "TABLE_LAMPS", "TABLE_RUNNERS", "TABLECLOTHS", "TABLES", "TABLEWARE", "TANK_TOPS", "TANNING_OILS_AND_LOTIONS", "TEETH_WHITENING", "TEETH_WHITENING_TOOLS", "TELEPHONY", "TEXTILE_AND_SEWING", "THREAD_AND_YARN", "THROW_PILLOWS", "TIARAS", "TOILET_PAPER_HOLDERS", "TONERS_AND_ASTRINGENTS", "TOOL_STORAGE_AND_ORGANIZATION", "TOOLS", "TOPS", "TOWEL_RACKS_AND_HOLDERS", "TOYS", "TRADITIONAL_AND_CEREMONIAL_CLOTHING", "TUMBLERS_AND_WATER_BOTTLES", "UNIFORMS", "VASES", "VEHICLE_PARTS_AND_ACCESSORIES", "VEILS", "WALL_CLOCKS", "WALL_LIGHT_FIXTURES", "WALL_PAINTS", "WALL_SHELVES_AND_LEDGES", "WALLETS_AND_CARD_CASES", "WALLPAPERS", "WATCHES", "WATERING_AND_IRRIGATION", "WEDDING_CEREMONY_DECOR", "WEDDING_CLOTHING", "WEDDING_DECOR", "WEDDING_DRESS", "WEDDING_GIFTS", "WEDDING_STATIONERY", "WEDDING_TABLE_DECOR", "WIGS_AND_HAIR_EXTENSIONS", "WINDOW_BLINDS_AND_SHADES", "WINDOW_TREATMENT_ACCESSORIES", "WINDOW_TREATMENTS", "WINE_RACKS", "WOOD_BOARDS_AND_PLANKS", "WOODWORKING_MATERIALS", "WOODWORKING_PLANS", "WORK_BENCHES", "WREATHS_AND_GARLANDS" };
    size_t sizeofArray = sizeof(PRODUCTCATEGORIESArray) / sizeof(PRODUCTCATEGORIESArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(PRODUCTCATEGORIES, PRODUCTCATEGORIESArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function trendsProductCategoriesDetailsList_PRODUCTCATEGORIES_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *trendsProductCategoriesDetailsList_PRODUCTCATEGORIES_convertToJSON(pinterest_rest_api_trendsProductCategoriesDetailsList_product_categories_e PRODUCTCATEGORIES) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function trendsProductCategoriesDetailsList_PRODUCTCATEGORIES_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_trendsProductCategoriesDetailsList_product_categories_e trendsProductCategoriesDetailsList_PRODUCTCATEGORIES_parseFromJSON(cJSON* PRODUCTCATEGORIESJSON) {
    pinterest_rest_api_trendsProductCategoriesDetailsList_product_categories_e PRODUCTCATEGORIESVariable = 0;
    return PRODUCTCATEGORIESVariable;
end:
    return 0;
}
*/

// Functions for enum  for ProductCategoriesAPI_trendsProductCategoriesDetailsList

static char* trendsProductCategoriesDetailsList__ToString(pinterest_rest_api_trendsProductCategoriesDetailsList_region_e ){
    char *Array[] =  { "NULL", "US", "GB+IE", "CA" };
    return Array[];
}

static pinterest_rest_api_trendsProductCategoriesDetailsList_region_e trendsProductCategoriesDetailsList__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "US", "GB+IE", "CA" };
    size_t sizeofArray = sizeof(Array) / sizeof(Array[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(, Array[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function trendsProductCategoriesDetailsList__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *trendsProductCategoriesDetailsList__convertToJSON(pinterest_rest_api_trendsProductCategoriesDetailsList_region_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function trendsProductCategoriesDetailsList__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_trendsProductCategoriesDetailsList_region_e trendsProductCategoriesDetailsList__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_trendsProductCategoriesDetailsList_region_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for ProductCategoriesAPI_trendsProductCategoriesDetailsList

static char* trendsProductCategoriesDetailsList__ToString(pinterest_rest_api_trendsProductCategoriesDetailsList_lookback_window_e ){
    char *Array[] =  { "NULL", "90", "180", "365", "730" };
    return Array[];
}

static pinterest_rest_api_trendsProductCategoriesDetailsList_lookback_window_e trendsProductCategoriesDetailsList__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "90", "180", "365", "730" };
    size_t sizeofArray = sizeof(Array) / sizeof(Array[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(, Array[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function trendsProductCategoriesDetailsList__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *trendsProductCategoriesDetailsList__convertToJSON(pinterest_rest_api_trendsProductCategoriesDetailsList_lookback_window_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function trendsProductCategoriesDetailsList__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_trendsProductCategoriesDetailsList_lookback_window_e trendsProductCategoriesDetailsList__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_trendsProductCategoriesDetailsList_lookback_window_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for ProductCategoriesAPI_trendsProductCategoriesDetailsList

static char* trendsProductCategoriesDetailsList__ToString(pinterest_rest_api_trendsProductCategoriesDetailsList_engagement_type_e ){
    char *Array[] =  { "NULL", "ENGAGEMENT", "OUTBOUND_CLICK", "SAVE" };
    return Array[];
}

static pinterest_rest_api_trendsProductCategoriesDetailsList_engagement_type_e trendsProductCategoriesDetailsList__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "ENGAGEMENT", "OUTBOUND_CLICK", "SAVE" };
    size_t sizeofArray = sizeof(Array) / sizeof(Array[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(, Array[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function trendsProductCategoriesDetailsList__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *trendsProductCategoriesDetailsList__convertToJSON(pinterest_rest_api_trendsProductCategoriesDetailsList_engagement_type_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function trendsProductCategoriesDetailsList__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_trendsProductCategoriesDetailsList_engagement_type_e trendsProductCategoriesDetailsList__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_trendsProductCategoriesDetailsList_engagement_type_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum  for ProductCategoriesAPI_trendsProductCategoriesTrendingList

static char* trendsProductCategoriesTrendingList__ToString(pinterest_rest_api_trendsProductCategoriesTrendingList_region_e ){
    char *Array[] =  { "NULL", "US", "GB+IE", "CA" };
    return Array[];
}

static pinterest_rest_api_trendsProductCategoriesTrendingList_region_e trendsProductCategoriesTrendingList__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "US", "GB+IE", "CA" };
    size_t sizeofArray = sizeof(Array) / sizeof(Array[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(, Array[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function trendsProductCategoriesTrendingList__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *trendsProductCategoriesTrendingList__convertToJSON(pinterest_rest_api_trendsProductCategoriesTrendingList_region_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function trendsProductCategoriesTrendingList__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_trendsProductCategoriesTrendingList_region_e trendsProductCategoriesTrendingList__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_trendsProductCategoriesTrendingList_region_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/

// Functions for enum VERTICALS for ProductCategoriesAPI_trendsProductCategoriesTrendingList

static char* trendsProductCategoriesTrendingList_VERTICALS_ToString(pinterest_rest_api_trendsProductCategoriesTrendingList_verticals_e VERTICALS){
    char *VERTICALSArray[] =  { "NULL", "FASHION", "HOME_DECOR", "BEAUTY" };
    return VERTICALSArray[VERTICALS];
}

static pinterest_rest_api_trendsProductCategoriesTrendingList_verticals_e trendsProductCategoriesTrendingList_VERTICALS_FromString(char* VERTICALS){
    int stringToReturn = 0;
    char *VERTICALSArray[] =  { "NULL", "FASHION", "HOME_DECOR", "BEAUTY" };
    size_t sizeofArray = sizeof(VERTICALSArray) / sizeof(VERTICALSArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(VERTICALS, VERTICALSArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function trendsProductCategoriesTrendingList_VERTICALS_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *trendsProductCategoriesTrendingList_VERTICALS_convertToJSON(pinterest_rest_api_trendsProductCategoriesTrendingList_verticals_e VERTICALS) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function trendsProductCategoriesTrendingList_VERTICALS_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_trendsProductCategoriesTrendingList_verticals_e trendsProductCategoriesTrendingList_VERTICALS_parseFromJSON(cJSON* VERTICALSJSON) {
    pinterest_rest_api_trendsProductCategoriesTrendingList_verticals_e VERTICALSVariable = 0;
    return VERTICALSVariable;
end:
    return 0;
}
*/

// Functions for enum AGES for ProductCategoriesAPI_trendsProductCategoriesTrendingList

static char* trendsProductCategoriesTrendingList_AGES_ToString(pinterest_rest_api_trendsProductCategoriesTrendingList_ages_e AGES){
    char *AGESArray[] =  { "NULL", "18-24", "25-34", "35-44", "45-49", "50-54", "55-64", "65+" };
    return AGESArray[AGES];
}

static pinterest_rest_api_trendsProductCategoriesTrendingList_ages_e trendsProductCategoriesTrendingList_AGES_FromString(char* AGES){
    int stringToReturn = 0;
    char *AGESArray[] =  { "NULL", "18-24", "25-34", "35-44", "45-49", "50-54", "55-64", "65+" };
    size_t sizeofArray = sizeof(AGESArray) / sizeof(AGESArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(AGES, AGESArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function trendsProductCategoriesTrendingList_AGES_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *trendsProductCategoriesTrendingList_AGES_convertToJSON(pinterest_rest_api_trendsProductCategoriesTrendingList_ages_e AGES) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function trendsProductCategoriesTrendingList_AGES_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_trendsProductCategoriesTrendingList_ages_e trendsProductCategoriesTrendingList_AGES_parseFromJSON(cJSON* AGESJSON) {
    pinterest_rest_api_trendsProductCategoriesTrendingList_ages_e AGESVariable = 0;
    return AGESVariable;
end:
    return 0;
}
*/

// Functions for enum GENDERS for ProductCategoriesAPI_trendsProductCategoriesTrendingList

static char* trendsProductCategoriesTrendingList_GENDERS_ToString(pinterest_rest_api_trendsProductCategoriesTrendingList_genders_e GENDERS){
    char *GENDERSArray[] =  { "NULL", "MALE", "FEMALE", "UNSPECIFIED" };
    return GENDERSArray[GENDERS];
}

static pinterest_rest_api_trendsProductCategoriesTrendingList_genders_e trendsProductCategoriesTrendingList_GENDERS_FromString(char* GENDERS){
    int stringToReturn = 0;
    char *GENDERSArray[] =  { "NULL", "MALE", "FEMALE", "UNSPECIFIED" };
    size_t sizeofArray = sizeof(GENDERSArray) / sizeof(GENDERSArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(GENDERS, GENDERSArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function trendsProductCategoriesTrendingList_GENDERS_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *trendsProductCategoriesTrendingList_GENDERS_convertToJSON(pinterest_rest_api_trendsProductCategoriesTrendingList_genders_e GENDERS) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function trendsProductCategoriesTrendingList_GENDERS_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_trendsProductCategoriesTrendingList_genders_e trendsProductCategoriesTrendingList_GENDERS_parseFromJSON(cJSON* GENDERSJSON) {
    pinterest_rest_api_trendsProductCategoriesTrendingList_genders_e GENDERSVariable = 0;
    return GENDERSVariable;
end:
    return 0;
}
*/

// Functions for enum  for ProductCategoriesAPI_trendsProductCategoriesTrendingList

static char* trendsProductCategoriesTrendingList__ToString(pinterest_rest_api_trendsProductCategoriesTrendingList_engagement_type_e ){
    char *Array[] =  { "NULL", "ENGAGEMENT", "OUTBOUND_CLICK", "SAVE" };
    return Array[];
}

static pinterest_rest_api_trendsProductCategoriesTrendingList_engagement_type_e trendsProductCategoriesTrendingList__FromString(char* ){
    int stringToReturn = 0;
    char *Array[] =  { "NULL", "ENGAGEMENT", "OUTBOUND_CLICK", "SAVE" };
    size_t sizeofArray = sizeof(Array) / sizeof(Array[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(, Array[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function trendsProductCategoriesTrendingList__convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *trendsProductCategoriesTrendingList__convertToJSON(pinterest_rest_api_trendsProductCategoriesTrendingList_engagement_type_e ) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function trendsProductCategoriesTrendingList__parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_trendsProductCategoriesTrendingList_engagement_type_e trendsProductCategoriesTrendingList__parseFromJSON(cJSON* JSON) {
    pinterest_rest_api_trendsProductCategoriesTrendingList_engagement_type_e Variable = 0;
    return Variable;
end:
    return 0;
}
*/


// Get featured topics
//
//   Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.
//
list_t*
ProductCategoriesAPI_trendsFeaturedTopicsList(apiClient_t *apiClient, product_category_region_e region, interests_enum_e interest)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/trends/topics/featured");





    // query parameters
    char *keyQuery_interest = NULL;
    interests_enum_e valueQuery_interest ;
    keyValuePair_t *keyPairQuery_interest = 0;
    if (interest)
    {
        keyQuery_interest = strdup("interest");
        valueQuery_interest = (interest);
        keyPairQuery_interest = keyValuePair_create(keyQuery_interest, strdup(trendsFeaturedTopicsList__ToString(
        &valueQuery_interest)));
        list_addElement(localVarQueryParameters,keyPairQuery_interest);
    }

    // query parameters
    char *keyQuery_region = NULL;
    product_category_region_e valueQuery_region ;
    keyValuePair_t *keyPairQuery_region = 0;
    if (region)
    {
        keyQuery_region = strdup("region");
        valueQuery_region = (region);
        keyPairQuery_region = keyValuePair_create(keyQuery_region, strdup(trendsFeaturedTopicsList__ToString(
        &valueQuery_region)));
        list_addElement(localVarQueryParameters,keyPairQuery_region);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","The request has succeeded.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","The request could not be understood by the server due to unexpected data.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 401) {
    //    printf("%s\n","Authentication is required and has either failed or not been provided.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","The requested resource could not be found on this server.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 429) {
    //    printf("%s\n","The user has sent too many requests in a given amount of time and is being rate limited.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","An unexpected error response.");
    //}
    list_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *ProductCategoriesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        if(!cJSON_IsArray(ProductCategoriesAPIlocalVarJSON)) {
            return 0;//nonprimitive container
        }
        elementToReturn = list_createList();
        cJSON *VarJSON;
        cJSON_ArrayForEach(VarJSON, ProductCategoriesAPIlocalVarJSON)
        {
            if(!cJSON_IsObject(VarJSON))
            {
               // return 0;
            }
            char *localVarJSONToChar = cJSON_Print(VarJSON);
            list_addElement(elementToReturn , localVarJSONToChar);
        }

        cJSON_Delete( ProductCategoriesAPIlocalVarJSON);
        cJSON_Delete( VarJSON);
    }
    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    if(keyQuery_interest){
        free(keyQuery_interest);
        keyQuery_interest = NULL;
    }
    if(keyPairQuery_interest){
        keyValuePair_free(keyPairQuery_interest);
        keyPairQuery_interest = NULL;
    }
    if(keyQuery_region){
        free(keyQuery_region);
        keyQuery_region = NULL;
    }
    if(keyPairQuery_region){
        keyValuePair_free(keyPairQuery_region);
        keyPairQuery_region = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get product category details
//
//   Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories
//
list_t*
ProductCategoriesAPI_trendsProductCategoriesDetailsList(apiClient_t *apiClient, list_t *product_categories, product_category_region_e region, product_category_detail_lookback_window_e lookback_window, product_categories_engagement_type_e engagement_type)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/trends/product_categories/details");





    // query parameters
    if (product_categories)
    {
        list_addElement(localVarQueryParameters,product_categories);
    }

    // query parameters
    char *keyQuery_region = NULL;
    product_category_region_e valueQuery_region ;
    keyValuePair_t *keyPairQuery_region = 0;
    if (region)
    {
        keyQuery_region = strdup("region");
        valueQuery_region = (region);
        keyPairQuery_region = keyValuePair_create(keyQuery_region, strdup(trendsProductCategoriesDetailsList__ToString(
        &valueQuery_region)));
        list_addElement(localVarQueryParameters,keyPairQuery_region);
    }

    // query parameters
    char *keyQuery_lookback_window = NULL;
    product_category_detail_lookback_window_e valueQuery_lookback_window ;
    keyValuePair_t *keyPairQuery_lookback_window = 0;
    if (lookback_window)
    {
        keyQuery_lookback_window = strdup("lookback_window");
        valueQuery_lookback_window = (lookback_window);
        keyPairQuery_lookback_window = keyValuePair_create(keyQuery_lookback_window, strdup(trendsProductCategoriesDetailsList__ToString(
        &valueQuery_lookback_window)));
        list_addElement(localVarQueryParameters,keyPairQuery_lookback_window);
    }

    // query parameters
    char *keyQuery_engagement_type = NULL;
    product_categories_engagement_type_e valueQuery_engagement_type ;
    keyValuePair_t *keyPairQuery_engagement_type = 0;
    if (engagement_type)
    {
        keyQuery_engagement_type = strdup("engagement_type");
        valueQuery_engagement_type = (engagement_type);
        keyPairQuery_engagement_type = keyValuePair_create(keyQuery_engagement_type, strdup(trendsProductCategoriesDetailsList__ToString(
        &valueQuery_engagement_type)));
        list_addElement(localVarQueryParameters,keyPairQuery_engagement_type);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","The request has succeeded.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","The request could not be understood by the server due to unexpected data.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 401) {
    //    printf("%s\n","Authentication is required and has either failed or not been provided.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","The requested resource could not be found on this server.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 429) {
    //    printf("%s\n","The user has sent too many requests in a given amount of time and is being rate limited.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","An unexpected error response.");
    //}
    list_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *ProductCategoriesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        if(!cJSON_IsArray(ProductCategoriesAPIlocalVarJSON)) {
            return 0;//nonprimitive container
        }
        elementToReturn = list_createList();
        cJSON *VarJSON;
        cJSON_ArrayForEach(VarJSON, ProductCategoriesAPIlocalVarJSON)
        {
            if(!cJSON_IsObject(VarJSON))
            {
               // return 0;
            }
            char *localVarJSONToChar = cJSON_Print(VarJSON);
            list_addElement(elementToReturn , localVarJSONToChar);
        }

        cJSON_Delete( ProductCategoriesAPIlocalVarJSON);
        cJSON_Delete( VarJSON);
    }
    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    if(keyQuery_region){
        free(keyQuery_region);
        keyQuery_region = NULL;
    }
    if(keyPairQuery_region){
        keyValuePair_free(keyPairQuery_region);
        keyPairQuery_region = NULL;
    }
    if(keyQuery_lookback_window){
        free(keyQuery_lookback_window);
        keyQuery_lookback_window = NULL;
    }
    if(keyPairQuery_lookback_window){
        keyValuePair_free(keyPairQuery_lookback_window);
        keyPairQuery_lookback_window = NULL;
    }
    if(keyQuery_engagement_type){
        free(keyQuery_engagement_type);
        keyQuery_engagement_type = NULL;
    }
    if(keyPairQuery_engagement_type){
        keyValuePair_free(keyPairQuery_engagement_type);
        keyPairQuery_engagement_type = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Get a list of growing Shopping Product Categories
//
//   Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.
//
list_t*
ProductCategoriesAPI_trendsProductCategoriesTrendingList(apiClient_t *apiClient, product_category_region_e region, list_t *verticals, list_t *ages, list_t *genders, product_categories_engagement_type_e engagement_type)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;
    size_t     localVarBodyLength = 0;

    // clear the error code from the previous api call
    apiClient->response_code = 0;

    // create the path
    char *localVarPath = strdup("/trends/product_categories/trending");





    // query parameters
    char *keyQuery_region = NULL;
    product_category_region_e valueQuery_region ;
    keyValuePair_t *keyPairQuery_region = 0;
    if (region)
    {
        keyQuery_region = strdup("region");
        valueQuery_region = (region);
        keyPairQuery_region = keyValuePair_create(keyQuery_region, strdup(trendsProductCategoriesTrendingList__ToString(
        &valueQuery_region)));
        list_addElement(localVarQueryParameters,keyPairQuery_region);
    }

    // query parameters
    if (verticals)
    {
        list_addElement(localVarQueryParameters,verticals);
    }

    // query parameters
    if (ages)
    {
        list_addElement(localVarQueryParameters,ages);
    }

    // query parameters
    if (genders)
    {
        list_addElement(localVarQueryParameters,genders);
    }

    // query parameters
    char *keyQuery_engagement_type = NULL;
    product_categories_engagement_type_e valueQuery_engagement_type ;
    keyValuePair_t *keyPairQuery_engagement_type = 0;
    if (engagement_type)
    {
        keyQuery_engagement_type = strdup("engagement_type");
        valueQuery_engagement_type = (engagement_type);
        keyPairQuery_engagement_type = keyValuePair_create(keyQuery_engagement_type, strdup(trendsProductCategoriesTrendingList__ToString(
        &valueQuery_engagement_type)));
        list_addElement(localVarQueryParameters,keyPairQuery_engagement_type);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    localVarBodyLength,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","The request has succeeded.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","The request could not be understood by the server due to unexpected data.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 401) {
    //    printf("%s\n","Authentication is required and has either failed or not been provided.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","The requested resource could not be found on this server.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 429) {
    //    printf("%s\n","The user has sent too many requests in a given amount of time and is being rate limited.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","An unexpected error response.");
    //}
    list_t *elementToReturn = NULL;
    if(apiClient->response_code >= 200 && apiClient->response_code < 300) {
        cJSON *ProductCategoriesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
        if(!cJSON_IsArray(ProductCategoriesAPIlocalVarJSON)) {
            return 0;//nonprimitive container
        }
        elementToReturn = list_createList();
        cJSON *VarJSON;
        cJSON_ArrayForEach(VarJSON, ProductCategoriesAPIlocalVarJSON)
        {
            if(!cJSON_IsObject(VarJSON))
            {
               // return 0;
            }
            char *localVarJSONToChar = cJSON_Print(VarJSON);
            list_addElement(elementToReturn , localVarJSONToChar);
        }

        cJSON_Delete( ProductCategoriesAPIlocalVarJSON);
        cJSON_Delete( VarJSON);
    }
    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    if(keyQuery_region){
        free(keyQuery_region);
        keyQuery_region = NULL;
    }
    if(keyPairQuery_region){
        keyValuePair_free(keyPairQuery_region);
        keyPairQuery_region = NULL;
    }
    if(keyQuery_engagement_type){
        free(keyQuery_engagement_type);
        keyQuery_engagement_type = NULL;
    }
    if(keyPairQuery_engagement_type){
        keyValuePair_free(keyPairQuery_engagement_type);
        keyPairQuery_engagement_type = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

