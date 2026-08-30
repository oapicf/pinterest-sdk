//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/promotion.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'promotions_list200_response.g.dart';

/// PromotionsList200Response
///
/// Properties:
/// * [bookmark] 
/// * [items] 
@BuiltValue()
abstract class PromotionsList200Response implements Built<PromotionsList200Response, PromotionsList200ResponseBuilder> {
  @BuiltValueField(wireName: r'bookmark')
  String? get bookmark;

  @BuiltValueField(wireName: r'items')
  BuiltList<Promotion> get items;

  PromotionsList200Response._();

  factory PromotionsList200Response([void updates(PromotionsList200ResponseBuilder b)]) = _$PromotionsList200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PromotionsList200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PromotionsList200Response> get serializer => _$PromotionsList200ResponseSerializer();
}

class _$PromotionsList200ResponseSerializer implements PrimitiveSerializer<PromotionsList200Response> {
  @override
  final Iterable<Type> types = const [PromotionsList200Response, _$PromotionsList200Response];

  @override
  final String wireName = r'PromotionsList200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PromotionsList200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.bookmark != null) {
      yield r'bookmark';
      yield serializers.serialize(
        object.bookmark,
        specifiedType: const FullType.nullable(String),
      );
    }
    yield r'items';
    yield serializers.serialize(
      object.items,
      specifiedType: const FullType(BuiltList, [FullType(Promotion)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PromotionsList200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PromotionsList200ResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'bookmark':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.bookmark = valueDes;
          break;
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(Promotion)]),
          ) as BuiltList<Promotion>;
          result.items.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PromotionsList200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PromotionsList200ResponseBuilder();
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

