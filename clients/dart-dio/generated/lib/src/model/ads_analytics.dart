//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/date.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ads_analytics.g.dart';

/// AdsAnalytics
///
/// Properties:
/// * [AD_ID] 
/// * [DATE] 
@BuiltValue()
abstract class AdsAnalytics implements Built<AdsAnalytics, AdsAnalyticsBuilder> {
  @BuiltValueField(wireName: r'AD_ID')
  String get AD_ID;

  @BuiltValueField(wireName: r'DATE')
  Date? get DATE;

  AdsAnalytics._();

  factory AdsAnalytics([void updates(AdsAnalyticsBuilder b)]) = _$AdsAnalytics;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdsAnalyticsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdsAnalytics> get serializer => _$AdsAnalyticsSerializer();
}

class _$AdsAnalyticsSerializer implements PrimitiveSerializer<AdsAnalytics> {
  @override
  final Iterable<Type> types = const [AdsAnalytics, _$AdsAnalytics];

  @override
  final String wireName = r'AdsAnalytics';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdsAnalytics object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'AD_ID';
    yield serializers.serialize(
      object.AD_ID,
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
    AdsAnalytics object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdsAnalyticsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'AD_ID':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.AD_ID = valueDes;
          break;
        case r'DATE':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(Date),
          ) as Date?;
          if (valueDes == null) continue;
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
  AdsAnalytics deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdsAnalyticsBuilder();
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

