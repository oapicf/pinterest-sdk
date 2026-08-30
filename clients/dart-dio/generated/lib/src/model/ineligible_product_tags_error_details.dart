//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/ineligible_product_tag_error_item.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ineligible_product_tags_error_details.g.dart';

/// Details about ineligible product tags in the request.
///
/// Properties:
/// * [productTags] - List of product tags that failed eligibility check.
@BuiltValue()
abstract class IneligibleProductTagsErrorDetails implements Built<IneligibleProductTagsErrorDetails, IneligibleProductTagsErrorDetailsBuilder> {
  /// List of product tags that failed eligibility check.
  @BuiltValueField(wireName: r'product_tags')
  BuiltList<IneligibleProductTagErrorItem> get productTags;

  IneligibleProductTagsErrorDetails._();

  factory IneligibleProductTagsErrorDetails([void updates(IneligibleProductTagsErrorDetailsBuilder b)]) = _$IneligibleProductTagsErrorDetails;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(IneligibleProductTagsErrorDetailsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<IneligibleProductTagsErrorDetails> get serializer => _$IneligibleProductTagsErrorDetailsSerializer();
}

class _$IneligibleProductTagsErrorDetailsSerializer implements PrimitiveSerializer<IneligibleProductTagsErrorDetails> {
  @override
  final Iterable<Type> types = const [IneligibleProductTagsErrorDetails, _$IneligibleProductTagsErrorDetails];

  @override
  final String wireName = r'IneligibleProductTagsErrorDetails';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    IneligibleProductTagsErrorDetails object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'product_tags';
    yield serializers.serialize(
      object.productTags,
      specifiedType: const FullType(BuiltList, [FullType(IneligibleProductTagErrorItem)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    IneligibleProductTagsErrorDetails object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required IneligibleProductTagsErrorDetailsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'product_tags':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(IneligibleProductTagErrorItem)]),
          ) as BuiltList<IneligibleProductTagErrorItem>;
          result.productTags.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  IneligibleProductTagsErrorDetails deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = IneligibleProductTagsErrorDetailsBuilder();
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

