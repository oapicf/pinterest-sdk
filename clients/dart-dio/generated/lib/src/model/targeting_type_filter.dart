//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'targeting_type_filter.g.dart';

/// TargetingTypeFilter
///
/// Properties:
/// * [targetingTypes] - List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AUDIENCE_MULTIPLIER\"] is only available in CAMPAIGN_TARGETING level. [\"MEDIA_TYPE\"] is only available in PRODUCT_ITEM_TARGETING level. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
@BuiltValue()
abstract class TargetingTypeFilter implements Built<TargetingTypeFilter, TargetingTypeFilterBuilder> {
  /// List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AUDIENCE_MULTIPLIER\"] is only available in CAMPAIGN_TARGETING level. [\"MEDIA_TYPE\"] is only available in PRODUCT_ITEM_TARGETING level. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
  @BuiltValueField(wireName: r'targeting_types')
  BuiltList<TargetingTypeFilterTargetingTypesEnum>? get targetingTypes;
  // enum targetingTypesEnum {  KEYWORD,  APPTYPE,  GENDER,  LOCATION,  PLACEMENT,  COUNTRY,  TARGETED_INTEREST,  PINNER_INTEREST,  AUDIENCE_INCLUDE,  GEO,  AGE_BUCKET,  REGION,  MEDIA_TYPE,  AGE_BUCKET_AND_GENDER,  AUDIENCE_MULTIPLIER,  CREATIVE_ENHANCEMENTS,  LOCAL_ADS_STORE_CODE,  };

  TargetingTypeFilter._();

  factory TargetingTypeFilter([void updates(TargetingTypeFilterBuilder b)]) = _$TargetingTypeFilter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TargetingTypeFilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TargetingTypeFilter> get serializer => _$TargetingTypeFilterSerializer();
}

class _$TargetingTypeFilterSerializer implements PrimitiveSerializer<TargetingTypeFilter> {
  @override
  final Iterable<Type> types = const [TargetingTypeFilter, _$TargetingTypeFilter];

  @override
  final String wireName = r'TargetingTypeFilter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TargetingTypeFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.targetingTypes != null) {
      yield r'targeting_types';
      yield serializers.serialize(
        object.targetingTypes,
        specifiedType: const FullType(BuiltList, [FullType(TargetingTypeFilterTargetingTypesEnum)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    TargetingTypeFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TargetingTypeFilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'targeting_types':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(TargetingTypeFilterTargetingTypesEnum)]),
          ) as BuiltList<TargetingTypeFilterTargetingTypesEnum>;
          result.targetingTypes.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  TargetingTypeFilter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TargetingTypeFilterBuilder();
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

class TargetingTypeFilterTargetingTypesEnum extends EnumClass {

  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'KEYWORD')
  static const TargetingTypeFilterTargetingTypesEnum KEYWORD = _$targetingTypeFilterTargetingTypesEnum_KEYWORD;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'APPTYPE')
  static const TargetingTypeFilterTargetingTypesEnum APPTYPE = _$targetingTypeFilterTargetingTypesEnum_APPTYPE;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'GENDER')
  static const TargetingTypeFilterTargetingTypesEnum GENDER = _$targetingTypeFilterTargetingTypesEnum_GENDER;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'LOCATION')
  static const TargetingTypeFilterTargetingTypesEnum LOCATION = _$targetingTypeFilterTargetingTypesEnum_LOCATION;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'PLACEMENT')
  static const TargetingTypeFilterTargetingTypesEnum PLACEMENT = _$targetingTypeFilterTargetingTypesEnum_PLACEMENT;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'COUNTRY')
  static const TargetingTypeFilterTargetingTypesEnum COUNTRY = _$targetingTypeFilterTargetingTypesEnum_COUNTRY;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'TARGETED_INTEREST')
  static const TargetingTypeFilterTargetingTypesEnum TARGETED_INTEREST = _$targetingTypeFilterTargetingTypesEnum_TARGETED_INTEREST;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'PINNER_INTEREST')
  static const TargetingTypeFilterTargetingTypesEnum PINNER_INTEREST = _$targetingTypeFilterTargetingTypesEnum_PINNER_INTEREST;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'AUDIENCE_INCLUDE')
  static const TargetingTypeFilterTargetingTypesEnum AUDIENCE_INCLUDE = _$targetingTypeFilterTargetingTypesEnum_AUDIENCE_INCLUDE;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'GEO')
  static const TargetingTypeFilterTargetingTypesEnum GEO = _$targetingTypeFilterTargetingTypesEnum_GEO;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'AGE_BUCKET')
  static const TargetingTypeFilterTargetingTypesEnum AGE_BUCKET = _$targetingTypeFilterTargetingTypesEnum_AGE_BUCKET;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'REGION')
  static const TargetingTypeFilterTargetingTypesEnum REGION = _$targetingTypeFilterTargetingTypesEnum_REGION;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'MEDIA_TYPE')
  static const TargetingTypeFilterTargetingTypesEnum MEDIA_TYPE = _$targetingTypeFilterTargetingTypesEnum_MEDIA_TYPE;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'AGE_BUCKET_AND_GENDER')
  static const TargetingTypeFilterTargetingTypesEnum AGE_BUCKET_AND_GENDER = _$targetingTypeFilterTargetingTypesEnum_AGE_BUCKET_AND_GENDER;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'AUDIENCE_MULTIPLIER')
  static const TargetingTypeFilterTargetingTypesEnum AUDIENCE_MULTIPLIER = _$targetingTypeFilterTargetingTypesEnum_AUDIENCE_MULTIPLIER;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'CREATIVE_ENHANCEMENTS')
  static const TargetingTypeFilterTargetingTypesEnum CREATIVE_ENHANCEMENTS = _$targetingTypeFilterTargetingTypesEnum_CREATIVE_ENHANCEMENTS;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'LOCAL_ADS_STORE_CODE')
  static const TargetingTypeFilterTargetingTypesEnum LOCAL_ADS_STORE_CODE = _$targetingTypeFilterTargetingTypesEnum_LOCAL_ADS_STORE_CODE;

  static Serializer<TargetingTypeFilterTargetingTypesEnum> get serializer => _$targetingTypeFilterTargetingTypesEnumSerializer;

  const TargetingTypeFilterTargetingTypesEnum._(String name): super(name);

  static BuiltSet<TargetingTypeFilterTargetingTypesEnum> get values => _$targetingTypeFilterTargetingTypesEnumValues;
  static TargetingTypeFilterTargetingTypesEnum valueOf(String name) => _$targetingTypeFilterTargetingTypesEnumValueOf(name);
}

