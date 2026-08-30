//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/adgroup_tracking_feature_type.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'adgroup_tracking_features.g.dart';

/// AdgroupTrackingFeatures
///
/// Properties:
/// * [enabled] - Tracking features. To clear this field, set to null.
@BuiltValue()
abstract class AdgroupTrackingFeatures implements Built<AdgroupTrackingFeatures, AdgroupTrackingFeaturesBuilder> {
  /// Tracking features. To clear this field, set to null.
  @BuiltValueField(wireName: r'enabled')
  BuiltList<AdgroupTrackingFeatureType>? get enabled;

  AdgroupTrackingFeatures._();

  factory AdgroupTrackingFeatures([void updates(AdgroupTrackingFeaturesBuilder b)]) = _$AdgroupTrackingFeatures;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdgroupTrackingFeaturesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdgroupTrackingFeatures> get serializer => _$AdgroupTrackingFeaturesSerializer();
}

class _$AdgroupTrackingFeaturesSerializer implements PrimitiveSerializer<AdgroupTrackingFeatures> {
  @override
  final Iterable<Type> types = const [AdgroupTrackingFeatures, _$AdgroupTrackingFeatures];

  @override
  final String wireName = r'AdgroupTrackingFeatures';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdgroupTrackingFeatures object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.enabled != null) {
      yield r'enabled';
      yield serializers.serialize(
        object.enabled,
        specifiedType: const FullType(BuiltList, [FullType(AdgroupTrackingFeatureType)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AdgroupTrackingFeatures object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdgroupTrackingFeaturesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(AdgroupTrackingFeatureType)]),
          ) as BuiltList<AdgroupTrackingFeatureType>?;
          if (valueDes == null) continue;
          result.enabled.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdgroupTrackingFeatures deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdgroupTrackingFeaturesBuilder();
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

