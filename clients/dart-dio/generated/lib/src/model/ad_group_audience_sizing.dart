//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_group_audience_sizing.g.dart';

/// AdGroupAudienceSizing
///
/// Properties:
/// * [audienceSizeLowerBound] - The lower confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
/// * [audienceSizeUpperBound] - The upper confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
@BuiltValue()
abstract class AdGroupAudienceSizing implements Built<AdGroupAudienceSizing, AdGroupAudienceSizingBuilder> {
  /// The lower confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
  @BuiltValueField(wireName: r'audience_size_lower_bound')
  num? get audienceSizeLowerBound;

  /// The upper confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
  @BuiltValueField(wireName: r'audience_size_upper_bound')
  num? get audienceSizeUpperBound;

  AdGroupAudienceSizing._();

  factory AdGroupAudienceSizing([void updates(AdGroupAudienceSizingBuilder b)]) = _$AdGroupAudienceSizing;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdGroupAudienceSizingBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdGroupAudienceSizing> get serializer => _$AdGroupAudienceSizingSerializer();
}

class _$AdGroupAudienceSizingSerializer implements PrimitiveSerializer<AdGroupAudienceSizing> {
  @override
  final Iterable<Type> types = const [AdGroupAudienceSizing, _$AdGroupAudienceSizing];

  @override
  final String wireName = r'AdGroupAudienceSizing';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdGroupAudienceSizing object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.audienceSizeLowerBound != null) {
      yield r'audience_size_lower_bound';
      yield serializers.serialize(
        object.audienceSizeLowerBound,
        specifiedType: const FullType(num),
      );
    }
    if (object.audienceSizeUpperBound != null) {
      yield r'audience_size_upper_bound';
      yield serializers.serialize(
        object.audienceSizeUpperBound,
        specifiedType: const FullType(num),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AdGroupAudienceSizing object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdGroupAudienceSizingBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'audience_size_lower_bound':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.audienceSizeLowerBound = valueDes;
          break;
        case r'audience_size_upper_bound':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.audienceSizeUpperBound = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdGroupAudienceSizing deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdGroupAudienceSizingBuilder();
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

