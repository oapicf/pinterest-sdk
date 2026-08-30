//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/targeting_spec_age_bucket.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/targeting_spec_app_type.dart';
import 'package:openapi/src/model/targeting_spec_shopping_retargeting.dart';
import 'package:openapi/src/model/targeting_spec_gender.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'targeting_spec.g.dart';

/// Ad group targeting specification defining the ad group target audience. For example, `{\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"MINIMUM_AGE\":\"18\", \"MAXIMUM_AGE\":\"65+\"}`
///
/// Properties:
/// * [AGE_BUCKET] - **Legacy field.** Predefined age ranges. We recommend using MINIMUM_AGE and MAXIMUM_AGE instead for more flexible targeting. Cannot be combined with MINIMUM_AGE/MAXIMUM_AGE. If neither AGE_BUCKET nor MINIMUM_AGE/MAXIMUM_AGE are specified, all ages will be targeted.
/// * [APPTYPE] - Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted.
/// * [AUDIENCE_EXCLUDE] - Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\"2542620905475\"]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**.
/// * [AUDIENCE_INCLUDE] - Targeted customer list IDs. For example: [\"2542620905473\"]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**.
/// * [GENDER] - Targeted genders. Values: [\"unknown\",\"male\",\"female\"]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**.
/// * [GEO] - Region codes or postal codes to include for targeting.<br /><br /> Region codes represent broader geographical areas. Example: <code>US-CA</code> is the region code for California in the United States.<br /><br /> Postal codes represent more granular, specific areas. Example: <code>94103</code> is a postal code for a specifc area in San Francisco, California, U.S.A.<br /><br /> For each ad group, use only one of these methods, depending on which fits your targeting needs. Do not use both. For example, either specify a broader region code like <code>US-CA</code> or a more granular postal code within that regon, such as <code>94103</code>.<br /><br /> You can specify multiple region codes or postal codes in an array, depending on which method you choose.<br /><br /> Precede a region code array with the <code>region_codes</code> key and a postal code value with the <code>postal_codes</code> key. Examples:<br /><br /> <code>\"geo\": {</code><br /> <code>\"region_codes\": [\"US-CA\"]</code><br /> <code>}</code><br /><br /> <code>\"geo\": {</code><br /> <code>\"postal_codes\": [\"94103\"]</code><br /> <code>}</code><br /><br /> For each ad group, specify at least one <code>GEO</code> or <code>LOCATION</code>. <br /><br /> If you do not specifiy a <code>GEO</code> code, only <code>LOCATION</code> values will be targeted (See <code>LOCATION</code> parameter in this targeting spec.).<br /><br /> Learn how to <a href=\"/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones\" target=\"_blank\">get a current, complete list of codes</a>.
/// * [GEO_EXCLUDE] - Region codes or postal codes to exclude from the targeting inclusion area.<br /><br /> See <code>GEO</code> parameter in this targeting spec for rules, syntax, and other information.<br />
/// * [INTEREST] - Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**.
/// * [LOCALE] - 24 ISO 639-1 two-letter language codes. If the LOCALE field is not included in the request, all languages are targeted.
/// * [LOCATION] - Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to include for targeting.<br /><br /> Precede country code values with the <code>country_codes</code> key and metro code values with <code>metro_codes</code> key. Example:<br /><br /> <code>\"location\": {</code><br /> <code>\"country_codes\": [\"US\", \"CA\"],</code><br /> <code>\"metro_codes\": [\"501\", \"602\"]</code><br /> <code>}</code><br /><br /> For each ad group, specify at least one <code>GEO</code> or <code>LOCATION</code> code. <br /><br /> If you do not specify a <code>LOCATION</code> code, only <code>GEO</code> values will be targeted (See <code>GEO</code> parameter in this targeting spec.).<br /><br /> Learn how to <a href=\"/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones\" target=\"_blank\">get a current, complete list of codes</a>.
/// * [LOCATION_EXCLUDE] - Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to exclude from targeting.<br /><br /> See <code>LOCATION</code> parameter in this targeting spec for rules, syntax, and other information.
/// * [MAXIMUM_AGE] - Maximum age to target (inclusive). Values: \"18\", \"19\", ..., \"65\", \"65+\". Must be used together with `MINIMUM_AGE`. Cannot be combined with `AGE_BUCKET`. If neither `MINIMUM_AGE`/`MAXIMUM_AGE` nor `AGE_BUCKET` are specified, all ages will be targeted.
/// * [MINIMUM_AGE] - Minimum age to target (inclusive). Values: \"18\", \"19\", ..., \"65\". Note: 65+ is not allowed for minimum age. Must be used together with `MAXIMUM_AGE`. Cannot be combined with `AGE_BUCKET`. If neither `MINIMUM_AGE`/`MAXIMUM_AGE` nor `AGE_BUCKET` are specified, all ages will be targeted.
/// * [SHOPPING_RETARGETING] - Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting
/// * [TARGETING_STRATEGY] 
@BuiltValue()
abstract class TargetingSpec implements Built<TargetingSpec, TargetingSpecBuilder> {
  /// **Legacy field.** Predefined age ranges. We recommend using MINIMUM_AGE and MAXIMUM_AGE instead for more flexible targeting. Cannot be combined with MINIMUM_AGE/MAXIMUM_AGE. If neither AGE_BUCKET nor MINIMUM_AGE/MAXIMUM_AGE are specified, all ages will be targeted.
  @BuiltValueField(wireName: r'AGE_BUCKET')
  BuiltList<TargetingSpecAgeBucket>? get AGE_BUCKET;

  /// Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted.
  @BuiltValueField(wireName: r'APPTYPE')
  BuiltList<TargetingSpecAppType>? get APPTYPE;

  /// Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\"2542620905475\"]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**.
  @BuiltValueField(wireName: r'AUDIENCE_EXCLUDE')
  BuiltList<String>? get AUDIENCE_EXCLUDE;

  /// Targeted customer list IDs. For example: [\"2542620905473\"]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**.
  @BuiltValueField(wireName: r'AUDIENCE_INCLUDE')
  BuiltList<String>? get AUDIENCE_INCLUDE;

  /// Targeted genders. Values: [\"unknown\",\"male\",\"female\"]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**.
  @BuiltValueField(wireName: r'GENDER')
  BuiltList<TargetingSpecGender>? get GENDER;

  /// Region codes or postal codes to include for targeting.<br /><br /> Region codes represent broader geographical areas. Example: <code>US-CA</code> is the region code for California in the United States.<br /><br /> Postal codes represent more granular, specific areas. Example: <code>94103</code> is a postal code for a specifc area in San Francisco, California, U.S.A.<br /><br /> For each ad group, use only one of these methods, depending on which fits your targeting needs. Do not use both. For example, either specify a broader region code like <code>US-CA</code> or a more granular postal code within that regon, such as <code>94103</code>.<br /><br /> You can specify multiple region codes or postal codes in an array, depending on which method you choose.<br /><br /> Precede a region code array with the <code>region_codes</code> key and a postal code value with the <code>postal_codes</code> key. Examples:<br /><br /> <code>\"geo\": {</code><br /> <code>\"region_codes\": [\"US-CA\"]</code><br /> <code>}</code><br /><br /> <code>\"geo\": {</code><br /> <code>\"postal_codes\": [\"94103\"]</code><br /> <code>}</code><br /><br /> For each ad group, specify at least one <code>GEO</code> or <code>LOCATION</code>. <br /><br /> If you do not specifiy a <code>GEO</code> code, only <code>LOCATION</code> values will be targeted (See <code>LOCATION</code> parameter in this targeting spec.).<br /><br /> Learn how to <a href=\"/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones\" target=\"_blank\">get a current, complete list of codes</a>.
  @BuiltValueField(wireName: r'GEO')
  BuiltList<String>? get GEO;

  /// Region codes or postal codes to exclude from the targeting inclusion area.<br /><br /> See <code>GEO</code> parameter in this targeting spec for rules, syntax, and other information.<br />
  @BuiltValueField(wireName: r'GEO_EXCLUDE')
  BuiltList<String>? get GEO_EXCLUDE;

  /// Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**.
  @BuiltValueField(wireName: r'INTEREST')
  BuiltList<String>? get INTEREST;

  /// 24 ISO 639-1 two-letter language codes. If the LOCALE field is not included in the request, all languages are targeted.
  @BuiltValueField(wireName: r'LOCALE')
  BuiltList<String>? get LOCALE;

  /// Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to include for targeting.<br /><br /> Precede country code values with the <code>country_codes</code> key and metro code values with <code>metro_codes</code> key. Example:<br /><br /> <code>\"location\": {</code><br /> <code>\"country_codes\": [\"US\", \"CA\"],</code><br /> <code>\"metro_codes\": [\"501\", \"602\"]</code><br /> <code>}</code><br /><br /> For each ad group, specify at least one <code>GEO</code> or <code>LOCATION</code> code. <br /><br /> If you do not specify a <code>LOCATION</code> code, only <code>GEO</code> values will be targeted (See <code>GEO</code> parameter in this targeting spec.).<br /><br /> Learn how to <a href=\"/docs/analytics-and-reports/ads-reporting/#get-all-available-codes-and-zones\" target=\"_blank\">get a current, complete list of codes</a>.
  @BuiltValueField(wireName: r'LOCATION')
  BuiltList<String>? get LOCATION;

  /// Metropolitan codes and/or ISO-Alpha-2, two-letter country codes to exclude from targeting.<br /><br /> See <code>LOCATION</code> parameter in this targeting spec for rules, syntax, and other information.
  @BuiltValueField(wireName: r'LOCATION_EXCLUDE')
  BuiltList<String>? get LOCATION_EXCLUDE;

  /// Maximum age to target (inclusive). Values: \"18\", \"19\", ..., \"65\", \"65+\". Must be used together with `MINIMUM_AGE`. Cannot be combined with `AGE_BUCKET`. If neither `MINIMUM_AGE`/`MAXIMUM_AGE` nor `AGE_BUCKET` are specified, all ages will be targeted.
  @BuiltValueField(wireName: r'MAXIMUM_AGE')
  String? get MAXIMUM_AGE;

  /// Minimum age to target (inclusive). Values: \"18\", \"19\", ..., \"65\". Note: 65+ is not allowed for minimum age. Must be used together with `MAXIMUM_AGE`. Cannot be combined with `AGE_BUCKET`. If neither `MINIMUM_AGE`/`MAXIMUM_AGE` nor `AGE_BUCKET` are specified, all ages will be targeted.
  @BuiltValueField(wireName: r'MINIMUM_AGE')
  String? get MINIMUM_AGE;

  /// Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting
  @BuiltValueField(wireName: r'SHOPPING_RETARGETING')
  BuiltList<TargetingSpecShoppingRetargeting>? get SHOPPING_RETARGETING;

  @BuiltValueField(wireName: r'TARGETING_STRATEGY')
  BuiltList<TargetingSpecTARGETING_STRATEGYEnum>? get TARGETING_STRATEGY;
  // enum TARGETING_STRATEGYEnum {  CHOOSE_YOUR_OWN,  FIND_NEW_CUSTOMERS,  RECONNECT_WITH_USERS,  };

  TargetingSpec._();

  factory TargetingSpec([void updates(TargetingSpecBuilder b)]) = _$TargetingSpec;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TargetingSpecBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TargetingSpec> get serializer => _$TargetingSpecSerializer();
}

class _$TargetingSpecSerializer implements PrimitiveSerializer<TargetingSpec> {
  @override
  final Iterable<Type> types = const [TargetingSpec, _$TargetingSpec];

  @override
  final String wireName = r'TargetingSpec';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TargetingSpec object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.AGE_BUCKET != null) {
      yield r'AGE_BUCKET';
      yield serializers.serialize(
        object.AGE_BUCKET,
        specifiedType: const FullType.nullable(BuiltList, [FullType(TargetingSpecAgeBucket)]),
      );
    }
    if (object.APPTYPE != null) {
      yield r'APPTYPE';
      yield serializers.serialize(
        object.APPTYPE,
        specifiedType: const FullType.nullable(BuiltList, [FullType(TargetingSpecAppType)]),
      );
    }
    if (object.AUDIENCE_EXCLUDE != null) {
      yield r'AUDIENCE_EXCLUDE';
      yield serializers.serialize(
        object.AUDIENCE_EXCLUDE,
        specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
      );
    }
    if (object.AUDIENCE_INCLUDE != null) {
      yield r'AUDIENCE_INCLUDE';
      yield serializers.serialize(
        object.AUDIENCE_INCLUDE,
        specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
      );
    }
    if (object.GENDER != null) {
      yield r'GENDER';
      yield serializers.serialize(
        object.GENDER,
        specifiedType: const FullType.nullable(BuiltList, [FullType(TargetingSpecGender)]),
      );
    }
    if (object.GEO != null) {
      yield r'GEO';
      yield serializers.serialize(
        object.GEO,
        specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
      );
    }
    if (object.GEO_EXCLUDE != null) {
      yield r'GEO_EXCLUDE';
      yield serializers.serialize(
        object.GEO_EXCLUDE,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.INTEREST != null) {
      yield r'INTEREST';
      yield serializers.serialize(
        object.INTEREST,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.LOCALE != null) {
      yield r'LOCALE';
      yield serializers.serialize(
        object.LOCALE,
        specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
      );
    }
    if (object.LOCATION != null) {
      yield r'LOCATION';
      yield serializers.serialize(
        object.LOCATION,
        specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
      );
    }
    if (object.LOCATION_EXCLUDE != null) {
      yield r'LOCATION_EXCLUDE';
      yield serializers.serialize(
        object.LOCATION_EXCLUDE,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.MAXIMUM_AGE != null) {
      yield r'MAXIMUM_AGE';
      yield serializers.serialize(
        object.MAXIMUM_AGE,
        specifiedType: const FullType(String),
      );
    }
    if (object.MINIMUM_AGE != null) {
      yield r'MINIMUM_AGE';
      yield serializers.serialize(
        object.MINIMUM_AGE,
        specifiedType: const FullType(String),
      );
    }
    if (object.SHOPPING_RETARGETING != null) {
      yield r'SHOPPING_RETARGETING';
      yield serializers.serialize(
        object.SHOPPING_RETARGETING,
        specifiedType: const FullType.nullable(BuiltList, [FullType(TargetingSpecShoppingRetargeting)]),
      );
    }
    if (object.TARGETING_STRATEGY != null) {
      yield r'TARGETING_STRATEGY';
      yield serializers.serialize(
        object.TARGETING_STRATEGY,
        specifiedType: const FullType.nullable(BuiltList, [FullType(TargetingSpecTARGETING_STRATEGYEnum)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    TargetingSpec object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TargetingSpecBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'AGE_BUCKET':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(TargetingSpecAgeBucket)]),
          ) as BuiltList<TargetingSpecAgeBucket>?;
          if (valueDes == null) continue;
          result.AGE_BUCKET.replace(valueDes);
          break;
        case r'APPTYPE':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(TargetingSpecAppType)]),
          ) as BuiltList<TargetingSpecAppType>?;
          if (valueDes == null) continue;
          result.APPTYPE.replace(valueDes);
          break;
        case r'AUDIENCE_EXCLUDE':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.AUDIENCE_EXCLUDE.replace(valueDes);
          break;
        case r'AUDIENCE_INCLUDE':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.AUDIENCE_INCLUDE.replace(valueDes);
          break;
        case r'GENDER':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(TargetingSpecGender)]),
          ) as BuiltList<TargetingSpecGender>?;
          if (valueDes == null) continue;
          result.GENDER.replace(valueDes);
          break;
        case r'GEO':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.GEO.replace(valueDes);
          break;
        case r'GEO_EXCLUDE':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.GEO_EXCLUDE.replace(valueDes);
          break;
        case r'INTEREST':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.INTEREST.replace(valueDes);
          break;
        case r'LOCALE':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.LOCALE.replace(valueDes);
          break;
        case r'LOCATION':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.LOCATION.replace(valueDes);
          break;
        case r'LOCATION_EXCLUDE':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.LOCATION_EXCLUDE.replace(valueDes);
          break;
        case r'MAXIMUM_AGE':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.MAXIMUM_AGE = valueDes;
          break;
        case r'MINIMUM_AGE':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.MINIMUM_AGE = valueDes;
          break;
        case r'SHOPPING_RETARGETING':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(TargetingSpecShoppingRetargeting)]),
          ) as BuiltList<TargetingSpecShoppingRetargeting>?;
          if (valueDes == null) continue;
          result.SHOPPING_RETARGETING.replace(valueDes);
          break;
        case r'TARGETING_STRATEGY':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(TargetingSpecTARGETING_STRATEGYEnum)]),
          ) as BuiltList<TargetingSpecTARGETING_STRATEGYEnum>?;
          if (valueDes == null) continue;
          result.TARGETING_STRATEGY.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  TargetingSpec deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TargetingSpecBuilder();
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

class TargetingSpecTARGETING_STRATEGYEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'CHOOSE_YOUR_OWN')
  static const TargetingSpecTARGETING_STRATEGYEnum CHOOSE_YOUR_OWN = _$targetingSpecTARGETINGSTRATEGYEnum_CHOOSE_YOUR_OWN;
  @BuiltValueEnumConst(wireName: r'FIND_NEW_CUSTOMERS')
  static const TargetingSpecTARGETING_STRATEGYEnum FIND_NEW_CUSTOMERS = _$targetingSpecTARGETINGSTRATEGYEnum_FIND_NEW_CUSTOMERS;
  @BuiltValueEnumConst(wireName: r'RECONNECT_WITH_USERS')
  static const TargetingSpecTARGETING_STRATEGYEnum RECONNECT_WITH_USERS = _$targetingSpecTARGETINGSTRATEGYEnum_RECONNECT_WITH_USERS;

  static Serializer<TargetingSpecTARGETING_STRATEGYEnum> get serializer => _$targetingSpecTARGETINGSTRATEGYEnumSerializer;

  const TargetingSpecTARGETING_STRATEGYEnum._(String name): super(name);

  static BuiltSet<TargetingSpecTARGETING_STRATEGYEnum> get values => _$targetingSpecTARGETINGSTRATEGYEnumValues;
  static TargetingSpecTARGETING_STRATEGYEnum valueOf(String name) => _$targetingSpecTARGETINGSTRATEGYEnumValueOf(name);
}

