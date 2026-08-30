//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ineligible_product_tags_error_details.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'product_tags_error.g.dart';

/// Error response for requests containing ineligible product tags.
///
/// Properties:
/// * [code] 
/// * [details] - Details about which product tags failed eligibility check.
/// * [message] 
@BuiltValue()
abstract class ProductTagsError implements Built<ProductTagsError, ProductTagsErrorBuilder> {
  @BuiltValueField(wireName: r'code')
  int get code;

  /// Details about which product tags failed eligibility check.
  @BuiltValueField(wireName: r'details')
  IneligibleProductTagsErrorDetails? get details;

  @BuiltValueField(wireName: r'message')
  String get message;

  ProductTagsError._();

  factory ProductTagsError([void updates(ProductTagsErrorBuilder b)]) = _$ProductTagsError;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ProductTagsErrorBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ProductTagsError> get serializer => _$ProductTagsErrorSerializer();
}

class _$ProductTagsErrorSerializer implements PrimitiveSerializer<ProductTagsError> {
  @override
  final Iterable<Type> types = const [ProductTagsError, _$ProductTagsError];

  @override
  final String wireName = r'ProductTagsError';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ProductTagsError object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'code';
    yield serializers.serialize(
      object.code,
      specifiedType: const FullType(int),
    );
    if (object.details != null) {
      yield r'details';
      yield serializers.serialize(
        object.details,
        specifiedType: const FullType(IneligibleProductTagsErrorDetails),
      );
    }
    yield r'message';
    yield serializers.serialize(
      object.message,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ProductTagsError object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ProductTagsErrorBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'code':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.code = valueDes;
          break;
        case r'details':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(IneligibleProductTagsErrorDetails),
          ) as IneligibleProductTagsErrorDetails?;
          if (valueDes == null) continue;
          result.details.replace(valueDes);
          break;
        case r'message':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.message = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ProductTagsError deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ProductTagsErrorBuilder();
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

