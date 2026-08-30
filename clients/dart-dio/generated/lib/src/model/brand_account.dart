//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'brand_account.g.dart';

/// BrandAccount
///
/// Properties:
/// * [brandAccountId] 
@BuiltValue()
abstract class BrandAccount implements Built<BrandAccount, BrandAccountBuilder> {
  @BuiltValueField(wireName: r'brand_account_id')
  String get brandAccountId;

  BrandAccount._();

  factory BrandAccount([void updates(BrandAccountBuilder b)]) = _$BrandAccount;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BrandAccountBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BrandAccount> get serializer => _$BrandAccountSerializer();
}

class _$BrandAccountSerializer implements PrimitiveSerializer<BrandAccount> {
  @override
  final Iterable<Type> types = const [BrandAccount, _$BrandAccount];

  @override
  final String wireName = r'BrandAccount';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BrandAccount object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'brand_account_id';
    yield serializers.serialize(
      object.brandAccountId,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    BrandAccount object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BrandAccountBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'brand_account_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.brandAccountId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BrandAccount deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BrandAccountBuilder();
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

