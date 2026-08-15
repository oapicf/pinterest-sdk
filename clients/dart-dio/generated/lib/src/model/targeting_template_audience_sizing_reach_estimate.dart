//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'targeting_template_audience_sizing_reach_estimate.g.dart';

/// TargetingTemplateAudienceSizingReachEstimate
///
/// Properties:
/// * [estimate] 
/// * [lowerBound] 
/// * [upperBound] 
@BuiltValue()
abstract class TargetingTemplateAudienceSizingReachEstimate implements Built<TargetingTemplateAudienceSizingReachEstimate, TargetingTemplateAudienceSizingReachEstimateBuilder> {
  @BuiltValueField(wireName: r'estimate')
  int? get estimate;

  @BuiltValueField(wireName: r'lower_bound')
  int? get lowerBound;

  @BuiltValueField(wireName: r'upper_bound')
  int? get upperBound;

  TargetingTemplateAudienceSizingReachEstimate._();

  factory TargetingTemplateAudienceSizingReachEstimate([void updates(TargetingTemplateAudienceSizingReachEstimateBuilder b)]) = _$TargetingTemplateAudienceSizingReachEstimate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TargetingTemplateAudienceSizingReachEstimateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TargetingTemplateAudienceSizingReachEstimate> get serializer => _$TargetingTemplateAudienceSizingReachEstimateSerializer();
}

class _$TargetingTemplateAudienceSizingReachEstimateSerializer implements PrimitiveSerializer<TargetingTemplateAudienceSizingReachEstimate> {
  @override
  final Iterable<Type> types = const [TargetingTemplateAudienceSizingReachEstimate, _$TargetingTemplateAudienceSizingReachEstimate];

  @override
  final String wireName = r'TargetingTemplateAudienceSizingReachEstimate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TargetingTemplateAudienceSizingReachEstimate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.estimate != null) {
      yield r'estimate';
      yield serializers.serialize(
        object.estimate,
        specifiedType: const FullType(int),
      );
    }
    if (object.lowerBound != null) {
      yield r'lower_bound';
      yield serializers.serialize(
        object.lowerBound,
        specifiedType: const FullType(int),
      );
    }
    if (object.upperBound != null) {
      yield r'upper_bound';
      yield serializers.serialize(
        object.upperBound,
        specifiedType: const FullType(int),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    TargetingTemplateAudienceSizingReachEstimate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TargetingTemplateAudienceSizingReachEstimateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'estimate':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.estimate = valueDes;
          break;
        case r'lower_bound':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.lowerBound = valueDes;
          break;
        case r'upper_bound':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.upperBound = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  TargetingTemplateAudienceSizingReachEstimate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TargetingTemplateAudienceSizingReachEstimateBuilder();
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

