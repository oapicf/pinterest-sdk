//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'brand_accounts_create200_response.g.dart';

/// BrandAccountsCreate200Response
///
/// Properties:
/// * [brandAccountId] - id of the newly created brand account
@BuiltValue()
abstract class BrandAccountsCreate200Response implements Built<BrandAccountsCreate200Response, BrandAccountsCreate200ResponseBuilder> {
  /// id of the newly created brand account
  @BuiltValueField(wireName: r'brand_account_id')
  String? get brandAccountId;

  BrandAccountsCreate200Response._();

  factory BrandAccountsCreate200Response([void updates(BrandAccountsCreate200ResponseBuilder b)]) = _$BrandAccountsCreate200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BrandAccountsCreate200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BrandAccountsCreate200Response> get serializer => _$BrandAccountsCreate200ResponseSerializer();
}

class _$BrandAccountsCreate200ResponseSerializer implements PrimitiveSerializer<BrandAccountsCreate200Response> {
  @override
  final Iterable<Type> types = const [BrandAccountsCreate200Response, _$BrandAccountsCreate200Response];

  @override
  final String wireName = r'BrandAccountsCreate200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BrandAccountsCreate200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.brandAccountId != null) {
      yield r'brand_account_id';
      yield serializers.serialize(
        object.brandAccountId,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BrandAccountsCreate200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BrandAccountsCreate200ResponseBuilder result,
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
  BrandAccountsCreate200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BrandAccountsCreate200ResponseBuilder();
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

