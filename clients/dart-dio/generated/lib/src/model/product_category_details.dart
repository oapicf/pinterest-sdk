//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/product_categories_demographic.dart';
import 'package:openapi/src/model/product_category_enum.dart';
import 'package:openapi/src/model/product_categories_metrics_highlights.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'product_category_details.g.dart';

/// Product category details
///
/// Properties:
/// * [demographics] 
/// * [hasPrediction] -      Indicates whether the keyword has a prediction available for the next 90 days.     This field is only applicable when include_prediction query parameter is set to true.     By default, the value is false and no prediction data is included in the response.
/// * [metricsHighlights] 
/// * [predictedTimeSeries] -      A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months.     These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword.     Similar to the historical time_series, normalization is applied independently to the predicted time series of each keyword, but the normalize_against_group query parameter can be used in cases where you wish to compare relative predicted volume between keywords.     **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.     **Note**: The date of each observation is in ISO-8601 format and represents the end of the week. For example, a value of 2024-01-07 would include predicted searches for the week ending on 2024-01-07.
/// * [productCategory] 
/// * [relatedSearches] - Related search terms for this product category
/// * [timeSeries] - Time series data showing trend values over time, indexed between 0 and 100
@BuiltValue()
abstract class ProductCategoryDetails implements Built<ProductCategoryDetails, ProductCategoryDetailsBuilder> {
  @BuiltValueField(wireName: r'demographics')
  ProductCategoriesDemographic? get demographics;

  ///      Indicates whether the keyword has a prediction available for the next 90 days.     This field is only applicable when include_prediction query parameter is set to true.     By default, the value is false and no prediction data is included in the response.
  @BuiltValueField(wireName: r'has_prediction')
  bool get hasPrediction;

  @BuiltValueField(wireName: r'metrics_highlights')
  ProductCategoriesMetricsHighlights? get metricsHighlights;

  ///      A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months.     These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword.     Similar to the historical time_series, normalization is applied independently to the predicted time series of each keyword, but the normalize_against_group query parameter can be used in cases where you wish to compare relative predicted volume between keywords.     **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.     **Note**: The date of each observation is in ISO-8601 format and represents the end of the week. For example, a value of 2024-01-07 would include predicted searches for the week ending on 2024-01-07.
  @BuiltValueField(wireName: r'predicted_time_series')
  BuiltMap<String, num>? get predictedTimeSeries;

  @BuiltValueField(wireName: r'product_category')
  ProductCategoryEnum get productCategory;
  // enum productCategoryEnum {  ACCENT_TABLES,  ACCESSORIES,  ANKLETS,  APRONS,  AREA_RUGS,  ARMOIRES_AND_WARDROBES,  ART_AND_CRAFT_PAINTS,  ART_BRUSHES,  ARTIFICIAL_FLORA,  ARTWORK,  AUDIO,  AUDIO_ACCESSORIES,  BACKPACKS,  BAG_AND_LUGGAGE_ACCESSORIES,  BAGS_AND_LUGGAGE,  BAKEWARE,  BANDANAS,  BAR_CARTS,  BARWARE,  BASKETS,  BATH_AND_BODY,  BATH_AND_SHOWER,  BATH_MATS_AND_RUGS,  BATH_TOWELS_AND_WASHCLOTHS,  BATHROOM_ACCESSORIES,  BATHROOM_ACCESSORY_SETS,  BATHROOM_VANITIES,  BEACH_TOWELS,  BEADS_AND_JEWELRY_MAKING_SUPPLIES,  BEAUTY_SUPPLEMENTS,  BED_SHEETS,  BEDDING,  BEDROOM_VANITIES,  BEDS_AND_ACCESSORIES,  BEDS_AND_BED_FRAMES,  BELT_BAGS,  BELTS_AND_SUSPENDERS,  BENCHES,  BEVERAGES,  BIRD_SUPPLIES,  BLANKETS,  BLOUSES,  BLUSHES_AND_BRONZERS,  BODY_CARE,  BODY_JEWELRY,  BODY_MAKEUP,  BODY_MOISTURIZERS,  BODY_WASHES,  BOOKCASES_AND_STANDING_SHELVES,  BOOKENDS,  BOOKS,  BOOTS,  BRACELETS,  BRIDESMAID_DRESSES,  BROOCHES_AND_LAPEL_PINS,  BROW_MAKEUP,  BUFFETS_AND_SIDEBOARDS,  BUTTON_DOWN_SHIRTS,  CABINET_HARDWARE,  CABINETS_AND_STORAGE_FURNITURE,  CAKE_DECORATING_SUPPLIES,  CAMPING_AND_HIKING,  CANDLE_HOLDERS,  CANDLES,  CARDSTOCK_PAPERS,  CASUAL_PANTS,  CAT_SUPPLIES,  CHAIRS,  CHANDELIERS,  CHARMS_AND_PENDANTS,  CHINA_CABINETS_AND_HUTCHES,  CLOGS_AND_MULES,  CLOTH_NAPKINS,  CLOTHING,  CLOTHING_AND_CLOSET_STORAGE,  CLOTHING_SETS,  COASTERS,  COATS_AND_JACKETS,  COFFEE_AND_TEA_CUPS,  COFFEE_MAKERS_AND_ESPRESSO_MACHINES,  COLORING_BOOKS,  COMMUNICATIONS,  COMPUTER_ACCESSORIES,  COOKIE_CUTTERS,  COOKWARE,  COOKWARE_AND_BAKEWARE,  COSMETIC_AND_TOILETRY_BAGS,  COSTUMES_AND_ACCESSORIES,  CRAFT_ADHESIVES_AND_MAGNETS,  CRAFT_CUTTING_TOOLS,  CRAFT_MOLDS,  CRIBS_AND_TODDLER_BEDS,  CURTAIN_AND_DRAPE_RODS,  CURTAINS_AND_DRAPES,  CUTTING_BOARDS,  CYCLING,  DECORATIVE_BOWLS,  DECORATIVE_JARS,  DECORATIVE_TAPESTRIES,  DECORATIVE_TRAYS,  DEODORANTS_AND_ANTIPERSPIRANTS,  DESK_AND_SHELF_CLOCKS,  DESKS,  DIAPER_BAGS,  DINNERWARE,  DISHWASHERS,  DOG_SUPPLIES,  DOOR_MATS,  DRAWING_AND_PAINTING,  DRESS_PANTS,  DRESSERS,  DRESSES,  DRILLS_AND_SCREWDRIVERS,  DRINKWARE,  DUFFEL_BAGS,  DUVET_COVERS,  DVDS_AND_VIDEOS,  EARRINGS,  ELECTRONICS_ACCESSORIES,  ENGAGEMENT_AND_WEDDING_RINGS,  ENTERTAINMENT_CENTERS_AND_TV_STANDS,  ERASERS,  EYE_MAKEUP,  EYE_SHADOW,  EYELINERS,  FABRIC,  FACE_COVERINGS,  FACE_LOTIONS_AND_CREAMS,  FACE_MAKEUP,  FACIAL_CLEANSERS,  FACIAL_MOISTURIZERS,  FALSE_EYELASHES,  FIGURINES,  FIREPLACE_AND_WOOD_STOVE_ACCESSORIES,  FIREPLACES,  FISHING,  FLAGS_AND_WINDSOCKS,  FLATS,  FLATWARE,  FLOOR_LAMPS,  FLOWER_GIRL_DRESSES,  FOOD_AND_BEVERAGE_CARRIERS,  FOOD_COOKERS_AND_STEAMERS,  FOOD_ITEMS,  FOOD_MIXERS_AND_BLENDERS,  FOOD_STORAGE_CONTAINERS,  FOOD_STORAGE_SUPPLIES,  FOUNDATIONS_AND_CONCEALERS,  FOUNTAINS_AND_PONDS,  FRAGRANCE,  FURNITURE,  FURNITURE_SETS,  GAMES,  GARDENING,  GARDENING_TOOLS,  GLOVES_AND_MITTENS,  GLUES_AND_TAPES,  GROOM_AND_GROOMSMEN_SUITS,  HAIR,  HAIR_ACCESSORIES,  HAIR_CARE,  HAIR_COLOR,  HAIR_COMBS,  HAIR_PINS_CLAWS_AND_CLIPS,  HAIR_REMOVAL,  HAIR_TOOLS,  HAIR_TREATMENT,  HAIR_WREATHS,  HAND_AND_FOOT_CARE,  HAND_SOAPS_AND_SANITIZERS,  HANDBAGS,  HANDKERCHIEFS,  HARDWARE_SUPPLIES,  HATS,  HEADBOARDS_AND_FOOTBOARDS,  HEADWEAR,  HIGHLIGHTERS,  HOBBIES_AND_CREATIVE_ARTS,  HOME_ACCESSORIES,  HOME_DECOR_DECALS,  HOME_FRAGRANCE_ACCESSORIES,  HOME_FRAGRANCES,  HOME_IMPROVEMENT_TOOLS_AND_SUPPLIES,  HOSIERY,  HOUSEHOLD_APPLIANCES,  HOUSEHOLD_SUPPLIES,  INCENSE,  INDOOR_GAMES,  JEANS,  JEWELRY_AND_WATCH_ACCESSORIES,  JEWELRY_AND_WATCHES,  JEWELRY_SETS,  JUMPSUITS_AND_ROMPERS,  KEYCHAINS,  KITCHEN_AND_DINING,  KITCHEN_AND_DINING_ROOM_TABLES,  KITCHEN_APPLIANCES,  KITCHEN_KNIVES,  KITCHEN_LINENS,  KITCHEN_MATS,  KITCHEN_ORGANIZERS,  KITCHEN_TOOLS_AND_UTENSILS,  KITCHEN_TOWELS,  KNITTING_AND_CROCHET,  KNITTING_AND_CROCHET_TOOLS,  LAMP_SHADES,  LAMPS,  LANYARDS,  LAUNDRY_HAMPERS_AND_SUPPLIES,  LAWN_AND_GARDEN,  LAWN_AND_GARDEN_DECOR,  LAWN_ORNAMENTS_AND_GARDEN_SCULPTURES,  LEGGINGS,  LEOTARDS_AND_UNITARDS,  LIGHTING,  LIGHTING_ACCESSORIES,  LIGHTING_FIXTURES,  LIP_BALMS,  LIP_CARE,  LIP_MAKEUP,  LIPSTICKS_AND_LIP_GLOSSES,  MAGAZINES_AND_NEWSPAPERS,  MAGNETS,  MAKEUP,  MAKEUP_TOOLS,  MASCARAS,  MATTRESSES,  MEASURES_AND_RULERS,  MEASURING_TOOLS_AND_SENSORS,  MESSENGER_BAGS,  MIRRORS,  MUSIC_AND_SOUND_RECORDINGS,  NAIL_ART,  NAIL_ART_KIT_AND_TOOLS,  NAIL_CARE,  NAIL_POLISHES,  NAILS,  NECKLACES,  NECKTIES,  NIGHT_LIGHTS_AND_AMBIENT_LIGHTING,  NIGHTSTANDS,  NOVELTY_SIGNS,  ONE_PIECES,  ONESIES,  OTTOMANS,  OUTDOOR_FURNITURE,  OUTDOOR_FURNITURE_SETS,  OUTDOOR_GAMES,  OUTDOOR_GRILLS,  OUTDOOR_LIVING,  OUTDOOR_PLAY_EQUIPMENT,  OUTDOOR_RECREATION,  OUTDOOR_RUGS,  OUTDOOR_SEATING,  OUTDOOR_STRUCTURES,  OUTDOOR_TABLES,  OUTERWEAR,  OVENS_AND_COOKTOPS,  OVERALLS,  OXFORDS_AND_LOAFERS,  PAINT_AND_PAINT_TOOLS,  PANTS,  PAPER_CRAFTS,  PARASOLS_AND_RAIN_UMBRELLAS,  PARTY_AND_CELEBRATION,  PENDANT_LIGHTS,  PENS_AND_PENCILS,  PERFUMES_AND_COLOGNES,  PET_CARRIERS_AND_CRATES,  PET_COLLARS_AND_HARNESSES,  PET_SUPPLIES,  PHOTO_ALBUMS_AND_STORAGE,  PICTURE_FRAMES,  PILLOWCASES_AND_SHAMS,  PINBACK_BUTTONS,  PLACEMATS,  PLANTS,  PONYTAIL_HOLDERS,  POOL_AND_SPA_ACCESSORIES,  POSTERS_PRINTS_AND_VISUAL_ARTWORK,  POTS_AND_PLANTERS,  POTTERY_AND_SCULPTING,  PRIMERS_AND_MAKEUP_SETTERS,  PUMPS,  PUZZLES,  QUILTS_AND_COMFORTERS,  RAZORS_AND_SHAVING_TOOLS,  RINGS,  RUGS,  RUNNER_RUGS,  SANDALS,  SASHES,  SAWS,  SCARVES_AND_SHAWLS,  SCULPTURES_AND_STATUES,  SEASONAL_AND_HOLIDAY_DECORATIONS,  SEATING,  SERUMS_AND_ESSENCES,  SERVEWARE,  SEWING_MACHINES,  SEWING_PATTERNS,  SHAMPOO_AND_CONDITIONER,  SHOE_ACCESSORIES,  SHOES,  SHOPPING_TOTES,  SHORTS,  SHOWER_CURTAINS,  SKINCARE,  SKINCARE_MASKS_AND_PEELS,  SKIRTS,  SLEEPWEAR_AND_LOUNGEWEAR,  SLIPCOVERS_AND_CUSHIONS,  SLIPPERS,  SNEAKERS_AND_ATHLETIC_SHOES,  SOCKS_AND_TIGHTS,  SOFAS,  SPORTS_UNIFORMS,  STEMWARE,  STOCKINGS,  STORAGE_AND_ORGANIZATION,  STORAGE_CABINETS_AND_LOCKERS,  STORAGE_HOOKS_AND_RACKS,  SUITCASES,  SUITS,  SUITS_AND_SUIT_SEPARATES,  GLASSES_AND_SUNGLASSES,  SUNSCREEN,  SWEATERS_AND_CARDIGANS,  SWEATSHIRTS_AND_HOODIES,  SWIMWEAR,  T_SHIRTS,  TABLE_LAMPS,  TABLE_RUNNERS,  TABLECLOTHS,  TABLES,  TABLEWARE,  TANK_TOPS,  TANNING_OILS_AND_LOTIONS,  TEETH_WHITENING,  TEETH_WHITENING_TOOLS,  TELEPHONY,  TEXTILE_AND_SEWING,  THREAD_AND_YARN,  THROW_PILLOWS,  TIARAS,  TOILET_PAPER_HOLDERS,  TONERS_AND_ASTRINGENTS,  TOOL_STORAGE_AND_ORGANIZATION,  TOOLS,  TOPS,  TOWEL_RACKS_AND_HOLDERS,  TOYS,  TRADITIONAL_AND_CEREMONIAL_CLOTHING,  TUMBLERS_AND_WATER_BOTTLES,  UNIFORMS,  VASES,  VEHICLE_PARTS_AND_ACCESSORIES,  VEILS,  WALL_CLOCKS,  WALL_LIGHT_FIXTURES,  WALL_PAINTS,  WALL_SHELVES_AND_LEDGES,  WALLETS_AND_CARD_CASES,  WALLPAPERS,  WATCHES,  WATERING_AND_IRRIGATION,  WEDDING_CEREMONY_DECOR,  WEDDING_CLOTHING,  WEDDING_DECOR,  WEDDING_DRESS,  WEDDING_GIFTS,  WEDDING_STATIONERY,  WEDDING_TABLE_DECOR,  WIGS_AND_HAIR_EXTENSIONS,  WINDOW_BLINDS_AND_SHADES,  WINDOW_TREATMENT_ACCESSORIES,  WINDOW_TREATMENTS,  WINE_RACKS,  WOOD_BOARDS_AND_PLANKS,  WOODWORKING_MATERIALS,  WOODWORKING_PLANS,  WORK_BENCHES,  WREATHS_AND_GARLANDS,  };

  /// Related search terms for this product category
  @BuiltValueField(wireName: r'related_searches')
  BuiltList<String>? get relatedSearches;

  /// Time series data showing trend values over time, indexed between 0 and 100
  @BuiltValueField(wireName: r'time_series')
  BuiltMap<String, num>? get timeSeries;

  ProductCategoryDetails._();

  factory ProductCategoryDetails([void updates(ProductCategoryDetailsBuilder b)]) = _$ProductCategoryDetails;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ProductCategoryDetailsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ProductCategoryDetails> get serializer => _$ProductCategoryDetailsSerializer();
}

class _$ProductCategoryDetailsSerializer implements PrimitiveSerializer<ProductCategoryDetails> {
  @override
  final Iterable<Type> types = const [ProductCategoryDetails, _$ProductCategoryDetails];

  @override
  final String wireName = r'ProductCategoryDetails';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ProductCategoryDetails object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.demographics != null) {
      yield r'demographics';
      yield serializers.serialize(
        object.demographics,
        specifiedType: const FullType(ProductCategoriesDemographic),
      );
    }
    yield r'has_prediction';
    yield serializers.serialize(
      object.hasPrediction,
      specifiedType: const FullType(bool),
    );
    if (object.metricsHighlights != null) {
      yield r'metrics_highlights';
      yield serializers.serialize(
        object.metricsHighlights,
        specifiedType: const FullType(ProductCategoriesMetricsHighlights),
      );
    }
    if (object.predictedTimeSeries != null) {
      yield r'predicted_time_series';
      yield serializers.serialize(
        object.predictedTimeSeries,
        specifiedType: const FullType(BuiltMap, [FullType(String), FullType(num)]),
      );
    }
    yield r'product_category';
    yield serializers.serialize(
      object.productCategory,
      specifiedType: const FullType(ProductCategoryEnum),
    );
    if (object.relatedSearches != null) {
      yield r'related_searches';
      yield serializers.serialize(
        object.relatedSearches,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.timeSeries != null) {
      yield r'time_series';
      yield serializers.serialize(
        object.timeSeries,
        specifiedType: const FullType(BuiltMap, [FullType(String), FullType(num)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ProductCategoryDetails object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ProductCategoryDetailsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'demographics':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ProductCategoriesDemographic),
          ) as ProductCategoriesDemographic;
          result.demographics.replace(valueDes);
          break;
        case r'has_prediction':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.hasPrediction = valueDes;
          break;
        case r'metrics_highlights':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ProductCategoriesMetricsHighlights),
          ) as ProductCategoriesMetricsHighlights;
          result.metricsHighlights.replace(valueDes);
          break;
        case r'predicted_time_series':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltMap, [FullType(String), FullType(num)]),
          ) as BuiltMap<String, num>;
          result.predictedTimeSeries.replace(valueDes);
          break;
        case r'product_category':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ProductCategoryEnum),
          ) as ProductCategoryEnum;
          result.productCategory = valueDes;
          break;
        case r'related_searches':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.relatedSearches.replace(valueDes);
          break;
        case r'time_series':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltMap, [FullType(String), FullType(num)]),
          ) as BuiltMap<String, num>;
          result.timeSeries.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ProductCategoryDetails deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ProductCategoryDetailsBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

