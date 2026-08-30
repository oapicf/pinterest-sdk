//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/mmm_reporting_column.dart';
import 'package:openapi/src/model/mmm_report_granularity.dart';
import 'package:openapi/src/model/mmm_report_level.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/mmm_reporting_targeting_type.dart';
import 'package:openapi/src/model/targeting_advertiser_country.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'mmm_report_create.g.dart';

/// Resource create operation model.
///
/// Properties:
/// * [advertiserIds] - Advertiser IDs for multi-advertiser report
/// * [columns] - Metric and entity columns
/// * [countries] - A List of countries for filtering
/// * [customColumnIds] - List of custom column IDs
/// * [endDate] - Metric report end date (UTC). Format: YYYY-MM-DD
/// * [granularity] -   DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly.
/// * [level] - Level of the report
/// * [reportName] - Name of the Marketing Mix Modeling (MMM) report
/// * [startDate] - Metric report start date (UTC). Format: YYYY-MM-DD
/// * [targetingTypes] - List of targeting types
@BuiltValue()
abstract class MMMReportCreate implements Built<MMMReportCreate, MMMReportCreateBuilder> {
  /// Advertiser IDs for multi-advertiser report
  @BuiltValueField(wireName: r'advertiser_ids')
  BuiltList<String>? get advertiserIds;

  /// Metric and entity columns
  @BuiltValueField(wireName: r'columns')
  BuiltList<MMMReportingColumn> get columns;

  /// A List of countries for filtering
  @BuiltValueField(wireName: r'countries')
  BuiltList<TargetingAdvertiserCountry?>? get countries;

  /// List of custom column IDs
  @BuiltValueField(wireName: r'custom_column_ids')
  BuiltList<String>? get customColumnIds;

  /// Metric report end date (UTC). Format: YYYY-MM-DD
  @BuiltValueField(wireName: r'end_date')
  String get endDate;

  ///   DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly.
  @BuiltValueField(wireName: r'granularity')
  MMMReportGranularity get granularity;
  // enum granularityEnum {  DAY,  WEEK,  };

  /// Level of the report
  @BuiltValueField(wireName: r'level')
  MMMReportLevel get level;
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

  MMMReportCreate._();

  factory MMMReportCreate([void updates(MMMReportCreateBuilder b)]) = _$MMMReportCreate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MMMReportCreateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MMMReportCreate> get serializer => _$MMMReportCreateSerializer();
}

class _$MMMReportCreateSerializer implements PrimitiveSerializer<MMMReportCreate> {
  @override
  final Iterable<Type> types = const [MMMReportCreate, _$MMMReportCreate];

  @override
  final String wireName = r'MMMReportCreate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MMMReportCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.advertiserIds != null) {
      yield r'advertiser_ids';
      yield serializers.serialize(
        object.advertiserIds,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    yield r'columns';
    yield serializers.serialize(
      object.columns,
      specifiedType: const FullType(BuiltList, [FullType(MMMReportingColumn)]),
    );
    if (object.countries != null) {
      yield r'countries';
      yield serializers.serialize(
        object.countries,
        specifiedType: const FullType(BuiltList, [FullType.nullable(TargetingAdvertiserCountry)]),
      );
    }
    if (object.customColumnIds != null) {
      yield r'custom_column_ids';
      yield serializers.serialize(
        object.customColumnIds,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    yield r'end_date';
    yield serializers.serialize(
      object.endDate,
      specifiedType: const FullType(String),
    );
    yield r'granularity';
    yield serializers.serialize(
      object.granularity,
      specifiedType: const FullType(MMMReportGranularity),
    );
    yield r'level';
    yield serializers.serialize(
      object.level,
      specifiedType: const FullType(MMMReportLevel),
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
    MMMReportCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MMMReportCreateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'advertiser_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.advertiserIds.replace(valueDes);
          break;
        case r'columns':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(MMMReportingColumn)]),
          ) as BuiltList<MMMReportingColumn>;
          result.columns.replace(valueDes);
          break;
        case r'countries':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType.nullable(TargetingAdvertiserCountry)]),
          ) as BuiltList<TargetingAdvertiserCountry?>?;
          if (valueDes == null) continue;
          result.countries.replace(valueDes);
          break;
        case r'custom_column_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.customColumnIds.replace(valueDes);
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
            specifiedType: const FullType(MMMReportGranularity),
          ) as MMMReportGranularity;
          result.granularity = valueDes;
          break;
        case r'level':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MMMReportLevel),
          ) as MMMReportLevel;
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
  MMMReportCreate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MMMReportCreateBuilder();
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

