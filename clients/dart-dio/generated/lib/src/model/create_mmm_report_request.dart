//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/mmm_reporting_column.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/mmm_reporting_targeting_type.dart';
import 'package:openapi/src/model/targeting_advertiser_country.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_mmm_report_request.g.dart';

/// CreateMMMReportRequest
///
/// Properties:
/// * [countries] - A List of countries for filtering
/// * [columns] - Metric and entity columns
/// * [endDate] - Metric report end date (UTC). Format: YYYY-MM-DD
/// * [granularity] - DAY - metrics are broken down daily.<br> WEEK - metrics are broken down weekly.
/// * [level] - Level of the report
/// * [reportName] - Name of the Marketing Mix Modeling (MMM) report
/// * [startDate] - Metric report start date (UTC). Format: YYYY-MM-DD
/// * [targetingTypes] - List of targeting types
@BuiltValue()
abstract class CreateMMMReportRequest implements Built<CreateMMMReportRequest, CreateMMMReportRequestBuilder> {
  /// A List of countries for filtering
  @BuiltValueField(wireName: r'countries')
  BuiltList<TargetingAdvertiserCountry?>? get countries;

  /// Metric and entity columns
  @BuiltValueField(wireName: r'columns')
  BuiltList<MMMReportingColumn> get columns;

  /// Metric report end date (UTC). Format: YYYY-MM-DD
  @BuiltValueField(wireName: r'end_date')
  String get endDate;

  /// DAY - metrics are broken down daily.<br> WEEK - metrics are broken down weekly.
  @BuiltValueField(wireName: r'granularity')
  CreateMMMReportRequestGranularityEnum get granularity;
  // enum granularityEnum {  DAY,  WEEK,  };

  /// Level of the report
  @BuiltValueField(wireName: r'level')
  CreateMMMReportRequestLevelEnum get level;
  // enum levelEnum {  CAMPAIGN_TARGETING,  AD_GROUP_TARGETING,  };

  /// Name of the Marketing Mix Modeling (MMM) report
  @BuiltValueField(wireName: r'report_name')
  String get reportName;

  /// Metric report start date (UTC). Format: YYYY-MM-DD
  @BuiltValueField(wireName: r'start_date')
  String get startDate;

  /// List of targeting types
  @BuiltValueField(wireName: r'targeting_types')
  BuiltList<MMMReportingTargetingType> get targetingTypes;

  CreateMMMReportRequest._();

  factory CreateMMMReportRequest([void updates(CreateMMMReportRequestBuilder b)]) = _$CreateMMMReportRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateMMMReportRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateMMMReportRequest> get serializer => _$CreateMMMReportRequestSerializer();
}

class _$CreateMMMReportRequestSerializer implements PrimitiveSerializer<CreateMMMReportRequest> {
  @override
  final Iterable<Type> types = const [CreateMMMReportRequest, _$CreateMMMReportRequest];

  @override
  final String wireName = r'CreateMMMReportRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateMMMReportRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.countries != null) {
      yield r'countries';
      yield serializers.serialize(
        object.countries,
        specifiedType: const FullType(BuiltList, [FullType.nullable(TargetingAdvertiserCountry)]),
      );
    }
    yield r'columns';
    yield serializers.serialize(
      object.columns,
      specifiedType: const FullType(BuiltList, [FullType(MMMReportingColumn)]),
    );
    yield r'end_date';
    yield serializers.serialize(
      object.endDate,
      specifiedType: const FullType(String),
    );
    yield r'granularity';
    yield serializers.serialize(
      object.granularity,
      specifiedType: const FullType(CreateMMMReportRequestGranularityEnum),
    );
    yield r'level';
    yield serializers.serialize(
      object.level,
      specifiedType: const FullType(CreateMMMReportRequestLevelEnum),
    );
    yield r'report_name';
    yield serializers.serialize(
      object.reportName,
      specifiedType: const FullType(String),
    );
    yield r'start_date';
    yield serializers.serialize(
      object.startDate,
      specifiedType: const FullType(String),
    );
    yield r'targeting_types';
    yield serializers.serialize(
      object.targetingTypes,
      specifiedType: const FullType(BuiltList, [FullType(MMMReportingTargetingType)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateMMMReportRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateMMMReportRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'countries':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType.nullable(TargetingAdvertiserCountry)]),
          ) as BuiltList<TargetingAdvertiserCountry?>;
          result.countries.replace(valueDes);
          break;
        case r'columns':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(MMMReportingColumn)]),
          ) as BuiltList<MMMReportingColumn>;
          result.columns.replace(valueDes);
          break;
        case r'end_date':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.endDate = valueDes;
          break;
        case r'granularity':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CreateMMMReportRequestGranularityEnum),
          ) as CreateMMMReportRequestGranularityEnum;
          result.granularity = valueDes;
          break;
        case r'level':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CreateMMMReportRequestLevelEnum),
          ) as CreateMMMReportRequestLevelEnum;
          result.level = valueDes;
          break;
        case r'report_name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.reportName = valueDes;
          break;
        case r'start_date':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.startDate = valueDes;
          break;
        case r'targeting_types':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(MMMReportingTargetingType)]),
          ) as BuiltList<MMMReportingTargetingType>;
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
  CreateMMMReportRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateMMMReportRequestBuilder();
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

class CreateMMMReportRequestGranularityEnum extends EnumClass {

  /// DAY - metrics are broken down daily.<br> WEEK - metrics are broken down weekly.
  @BuiltValueEnumConst(wireName: r'DAY')
  static const CreateMMMReportRequestGranularityEnum DAY = _$createMMMReportRequestGranularityEnum_DAY;
  /// DAY - metrics are broken down daily.<br> WEEK - metrics are broken down weekly.
  @BuiltValueEnumConst(wireName: r'WEEK')
  static const CreateMMMReportRequestGranularityEnum WEEK = _$createMMMReportRequestGranularityEnum_WEEK;

  static Serializer<CreateMMMReportRequestGranularityEnum> get serializer => _$createMMMReportRequestGranularityEnumSerializer;

  const CreateMMMReportRequestGranularityEnum._(String name): super(name);

  static BuiltSet<CreateMMMReportRequestGranularityEnum> get values => _$createMMMReportRequestGranularityEnumValues;
  static CreateMMMReportRequestGranularityEnum valueOf(String name) => _$createMMMReportRequestGranularityEnumValueOf(name);
}

class CreateMMMReportRequestLevelEnum extends EnumClass {

  /// Level of the report
  @BuiltValueEnumConst(wireName: r'CAMPAIGN_TARGETING')
  static const CreateMMMReportRequestLevelEnum CAMPAIGN_TARGETING = _$createMMMReportRequestLevelEnum_CAMPAIGN_TARGETING;
  /// Level of the report
  @BuiltValueEnumConst(wireName: r'AD_GROUP_TARGETING')
  static const CreateMMMReportRequestLevelEnum AD_GROUP_TARGETING = _$createMMMReportRequestLevelEnum_AD_GROUP_TARGETING;

  static Serializer<CreateMMMReportRequestLevelEnum> get serializer => _$createMMMReportRequestLevelEnumSerializer;

  const CreateMMMReportRequestLevelEnum._(String name): super(name);

  static BuiltSet<CreateMMMReportRequestLevelEnum> get values => _$createMMMReportRequestLevelEnumValues;
  static CreateMMMReportRequestLevelEnum valueOf(String name) => _$createMMMReportRequestLevelEnumValueOf(name);
}

