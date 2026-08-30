//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/targeting_spec_optimal.dart';
import 'package:openapi/src/model/bid_floor_spec.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'bid_floor_create.g.dart';

/// Resource create operation model.
///
/// Properties:
/// * [bidFloorSpecs] - List of bid floor specifications.
/// * [targetingSpec] - Ad group targeting specification defining the ad group target audience.
@BuiltValue()
abstract class BidFloorCreate implements Built<BidFloorCreate, BidFloorCreateBuilder> {
  /// List of bid floor specifications.
  @BuiltValueField(wireName: r'bid_floor_specs')
  BuiltList<BidFloorSpec> get bidFloorSpecs;

  /// Ad group targeting specification defining the ad group target audience.
  @BuiltValueField(wireName: r'targeting_spec')
  TargetingSpecOptimal? get targetingSpec;

  BidFloorCreate._();

  factory BidFloorCreate([void updates(BidFloorCreateBuilder b)]) = _$BidFloorCreate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BidFloorCreateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BidFloorCreate> get serializer => _$BidFloorCreateSerializer();
}

class _$BidFloorCreateSerializer implements PrimitiveSerializer<BidFloorCreate> {
  @override
  final Iterable<Type> types = const [BidFloorCreate, _$BidFloorCreate];

  @override
  final String wireName = r'BidFloorCreate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BidFloorCreate object, {
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
        specifiedType: const FullType(TargetingSpecOptimal),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BidFloorCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BidFloorCreateBuilder result,
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
            specifiedType: const FullType.nullable(TargetingSpecOptimal),
          ) as TargetingSpecOptimal?;
          if (valueDes == null) continue;
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
  BidFloorCreate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BidFloorCreateBuilder();
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

