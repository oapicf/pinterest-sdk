//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'bid_floor.g.dart';

/// Bid floor request and response model.
///
/// Properties:
/// * [bidFloors] - A list of bid floors in micro currency. For example, [100000, 200000]
/// * [type] - Always the string 'bidfloor'.
@BuiltValue()
abstract class BidFloor implements Built<BidFloor, BidFloorBuilder> {
  /// A list of bid floors in micro currency. For example, [100000, 200000]
  @BuiltValueField(wireName: r'bid_floors')
  BuiltList<int>? get bidFloors;

  /// Always the string 'bidfloor'.
  @BuiltValueField(wireName: r'type')
  String? get type;

  BidFloor._();

  factory BidFloor([void updates(BidFloorBuilder b)]) = _$BidFloor;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BidFloorBuilder b) => b
      ..type = 'bidfloor';

  @BuiltValueSerializer(custom: true)
  static Serializer<BidFloor> get serializer => _$BidFloorSerializer();
}

class _$BidFloorSerializer implements PrimitiveSerializer<BidFloor> {
  @override
  final Iterable<Type> types = const [BidFloor, _$BidFloor];

  @override
  final String wireName = r'BidFloor';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BidFloor object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.bidFloors != null) {
      yield r'bid_floors';
      yield serializers.serialize(
        object.bidFloors,
        specifiedType: const FullType(BuiltList, [FullType(int)]),
      );
    }
    if (object.type != null) {
      yield r'type';
      yield serializers.serialize(
        object.type,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BidFloor object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BidFloorBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'bid_floors':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(int)]),
          ) as BuiltList<int>?;
          if (valueDes == null) continue;
          result.bidFloors.replace(valueDes);
          break;
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.type = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BidFloor deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BidFloorBuilder();
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

