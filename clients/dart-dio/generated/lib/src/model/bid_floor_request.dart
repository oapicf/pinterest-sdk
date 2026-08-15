//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/targeting_spec.dart';
import 'package:openapi/src/model/bid_floor_spec.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'bid_floor_request.g.dart';

/// BidFloorRequest
///
/// Properties:
/// * [bidFloorSpecs] 
/// * [targetingSpec] 
@BuiltValue()
abstract class BidFloorRequest implements Built<BidFloorRequest, BidFloorRequestBuilder> {
  @BuiltValueField(wireName: r'bid_floor_specs')
  BuiltList<BidFloorSpec> get bidFloorSpecs;

  @BuiltValueField(wireName: r'targeting_spec')
  TargetingSpec? get targetingSpec;

  BidFloorRequest._();

  factory BidFloorRequest([void updates(BidFloorRequestBuilder b)]) = _$BidFloorRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BidFloorRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BidFloorRequest> get serializer => _$BidFloorRequestSerializer();
}

class _$BidFloorRequestSerializer implements PrimitiveSerializer<BidFloorRequest> {
  @override
  final Iterable<Type> types = const [BidFloorRequest, _$BidFloorRequest];

  @override
  final String wireName = r'BidFloorRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BidFloorRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'bid_floor_specs';
    yield serializers.serialize(
      object.bidFloorSpecs,
      specifiedType: const FullType(BuiltList, [FullType(BidFloorSpec)]),
    );
    if (object.targetingSpec != null) {
      yield r'targeting_spec';
      yield serializers.serialize(
        object.targetingSpec,
        specifiedType: const FullType(TargetingSpec),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BidFloorRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BidFloorRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'bid_floor_specs':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(BidFloorSpec)]),
          ) as BuiltList<BidFloorSpec>;
          result.bidFloorSpecs.replace(valueDes);
          break;
        case r'targeting_spec':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(TargetingSpec),
          ) as TargetingSpec;
          result.targetingSpec.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BidFloorRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BidFloorRequestBuilder();
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

