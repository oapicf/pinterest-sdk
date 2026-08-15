//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/date.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_account_analytics_response_inner.g.dart';

/// AdAccountAnalyticsResponseInner
///
/// Properties:
/// * [AD_ACCOUNT_ID] - The ID of the advertiser that this metrics belongs to.
/// * [DATE] - Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
@BuiltValue()
abstract class AdAccountAnalyticsResponseInner implements Built<AdAccountAnalyticsResponseInner, AdAccountAnalyticsResponseInnerBuilder> {
  /// The ID of the advertiser that this metrics belongs to.
  @BuiltValueField(wireName: r'AD_ACCOUNT_ID')
  String get AD_ACCOUNT_ID;

  /// Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
  @BuiltValueField(wireName: r'DATE')
  Date? get DATE;

  AdAccountAnalyticsResponseInner._();

  factory AdAccountAnalyticsResponseInner([void updates(AdAccountAnalyticsResponseInnerBuilder b)]) = _$AdAccountAnalyticsResponseInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdAccountAnalyticsResponseInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdAccountAnalyticsResponseInner> get serializer => _$AdAccountAnalyticsResponseInnerSerializer();
}

class _$AdAccountAnalyticsResponseInnerSerializer implements PrimitiveSerializer<AdAccountAnalyticsResponseInner> {
  @override
  final Iterable<Type> types = const [AdAccountAnalyticsResponseInner, _$AdAccountAnalyticsResponseInner];

  @override
  final String wireName = r'AdAccountAnalyticsResponseInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdAccountAnalyticsResponseInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'AD_ACCOUNT_ID';
    yield serializers.serialize(
      object.AD_ACCOUNT_ID,
      specifiedType: const FullType(String),
    );
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
    AdAccountAnalyticsResponseInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdAccountAnalyticsResponseInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'AD_ACCOUNT_ID':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.AD_ACCOUNT_ID = valueDes;
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
  AdAccountAnalyticsResponseInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdAccountAnalyticsResponseInnerBuilder();
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

