//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/targeting_template_audience_sizing_reach_estimate.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'targeting_template_audience_sizing.g.dart';

/// Gets an audience size estimate for a set of given targeting spec data. **Returns:** An object containing an audience size estimate that has a reach estimate (number of unique users) against the given targeting template. This by default provides a monthly estimate.
///
/// Properties:
/// * [reachEstimate] 
@BuiltValue()
abstract class TargetingTemplateAudienceSizing implements Built<TargetingTemplateAudienceSizing, TargetingTemplateAudienceSizingBuilder> {
  @BuiltValueField(wireName: r'reach_estimate')
  TargetingTemplateAudienceSizingReachEstimate? get reachEstimate;

  TargetingTemplateAudienceSizing._();

  factory TargetingTemplateAudienceSizing([void updates(TargetingTemplateAudienceSizingBuilder b)]) = _$TargetingTemplateAudienceSizing;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TargetingTemplateAudienceSizingBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TargetingTemplateAudienceSizing> get serializer => _$TargetingTemplateAudienceSizingSerializer();
}

class _$TargetingTemplateAudienceSizingSerializer implements PrimitiveSerializer<TargetingTemplateAudienceSizing> {
  @override
  final Iterable<Type> types = const [TargetingTemplateAudienceSizing, _$TargetingTemplateAudienceSizing];

  @override
  final String wireName = r'TargetingTemplateAudienceSizing';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TargetingTemplateAudienceSizing object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.reachEstimate != null) {
      yield r'reach_estimate';
      yield serializers.serialize(
        object.reachEstimate,
        specifiedType: const FullType(TargetingTemplateAudienceSizingReachEstimate),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    TargetingTemplateAudienceSizing object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TargetingTemplateAudienceSizingBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'reach_estimate':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(TargetingTemplateAudienceSizingReachEstimate),
          ) as TargetingTemplateAudienceSizingReachEstimate?;
          if (valueDes == null) continue;
          result.reachEstimate.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  TargetingTemplateAudienceSizing deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TargetingTemplateAudienceSizingBuilder();
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

