//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/date.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_groups_analytics_response_inner.g.dart';

/// AdGroupsAnalyticsResponseInner
///
/// Properties:
/// * [AD_GROUP_ID] - The ID of the ad group that this metrics belongs to. Returned as long as aggregate_report_rows is not true.
/// * [DATE] - Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
@BuiltValue()
abstract class AdGroupsAnalyticsResponseInner implements Built<AdGroupsAnalyticsResponseInner, AdGroupsAnalyticsResponseInnerBuilder> {
  /// The ID of the ad group that this metrics belongs to. Returned as long as aggregate_report_rows is not true.
  @BuiltValueField(wireName: r'AD_GROUP_ID')
  String? get AD_GROUP_ID;

  /// Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
  @BuiltValueField(wireName: r'DATE')
  Date? get DATE;

  AdGroupsAnalyticsResponseInner._();

  factory AdGroupsAnalyticsResponseInner([void updates(AdGroupsAnalyticsResponseInnerBuilder b)]) = _$AdGroupsAnalyticsResponseInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdGroupsAnalyticsResponseInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdGroupsAnalyticsResponseInner> get serializer => _$AdGroupsAnalyticsResponseInnerSerializer();
}

class _$AdGroupsAnalyticsResponseInnerSerializer implements PrimitiveSerializer<AdGroupsAnalyticsResponseInner> {
  @override
  final Iterable<Type> types = const [AdGroupsAnalyticsResponseInner, _$AdGroupsAnalyticsResponseInner];

  @override
  final String wireName = r'AdGroupsAnalyticsResponseInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdGroupsAnalyticsResponseInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.AD_GROUP_ID != null) {
      yield r'AD_GROUP_ID';
      yield serializers.serialize(
        object.AD_GROUP_ID,
        specifiedType: const FullType(String),
      );
    }
    if (object.DATE != null) {
      yield r'DATE';
      yield serializers.serialize(
        object.DATE,
        specifiedType: const FullType(Date),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AdGroupsAnalyticsResponseInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdGroupsAnalyticsResponseInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'AD_GROUP_ID':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.AD_GROUP_ID = valueDes;
          break;
        case r'DATE':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(Date),
          ) as Date;
          result.DATE = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdGroupsAnalyticsResponseInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdGroupsAnalyticsResponseInnerBuilder();
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

