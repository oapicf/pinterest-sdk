//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ssio_account_address.g.dart';

/// SSIOAccountAddress
///
/// Properties:
/// * [addressId] - Salesforce id for address
/// * [display] - Address display
/// * [orderLegalEntity] - Legal entity for this insertion order
/// * [purpose] - Purpose for which the address is used, usually Billing or Businness
@BuiltValue()
abstract class SSIOAccountAddress implements Built<SSIOAccountAddress, SSIOAccountAddressBuilder> {
  /// Salesforce id for address
  @BuiltValueField(wireName: r'address_id')
  String? get addressId;

  /// Address display
  @BuiltValueField(wireName: r'display')
  String? get display;

  /// Legal entity for this insertion order
  @BuiltValueField(wireName: r'order_legal_entity')
  String? get orderLegalEntity;

  /// Purpose for which the address is used, usually Billing or Businness
  @BuiltValueField(wireName: r'purpose')
  String? get purpose;

  SSIOAccountAddress._();

  factory SSIOAccountAddress([void updates(SSIOAccountAddressBuilder b)]) = _$SSIOAccountAddress;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(SSIOAccountAddressBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<SSIOAccountAddress> get serializer => _$SSIOAccountAddressSerializer();
}

class _$SSIOAccountAddressSerializer implements PrimitiveSerializer<SSIOAccountAddress> {
  @override
  final Iterable<Type> types = const [SSIOAccountAddress, _$SSIOAccountAddress];

  @override
  final String wireName = r'SSIOAccountAddress';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    SSIOAccountAddress object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.addressId != null) {
      yield r'address_id';
      yield serializers.serialize(
        object.addressId,
        specifiedType: const FullType(String),
      );
    }
    if (object.display != null) {
      yield r'display';
      yield serializers.serialize(
        object.display,
        specifiedType: const FullType(String),
      );
    }
    if (object.orderLegalEntity != null) {
      yield r'order_legal_entity';
      yield serializers.serialize(
        object.orderLegalEntity,
        specifiedType: const FullType(String),
      );
    }
    if (object.purpose != null) {
      yield r'purpose';
      yield serializers.serialize(
        object.purpose,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    SSIOAccountAddress object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required SSIOAccountAddressBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'address_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.addressId = valueDes;
          break;
        case r'display':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.display = valueDes;
          break;
        case r'order_legal_entity':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.orderLegalEntity = valueDes;
          break;
        case r'purpose':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.purpose = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  SSIOAccountAddress deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = SSIOAccountAddressBuilder();
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

