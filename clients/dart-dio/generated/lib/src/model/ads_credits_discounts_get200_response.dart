//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/paginated.dart';
import 'package:openapi/src/model/ads_credit_discounts_response.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ads_credits_discounts_get200_response.g.dart';

/// AdsCreditsDiscountsGet200Response
///
/// Properties:
/// * [bookmark] 
/// * [items] 
@BuiltValue()
abstract class AdsCreditsDiscountsGet200Response implements Paginated, Built<AdsCreditsDiscountsGet200Response, AdsCreditsDiscountsGet200ResponseBuilder> {
  AdsCreditsDiscountsGet200Response._();

  factory AdsCreditsDiscountsGet200Response([void updates(AdsCreditsDiscountsGet200ResponseBuilder b)]) = _$AdsCreditsDiscountsGet200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdsCreditsDiscountsGet200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdsCreditsDiscountsGet200Response> get serializer => _$AdsCreditsDiscountsGet200ResponseSerializer();
}

class _$AdsCreditsDiscountsGet200ResponseSerializer implements PrimitiveSerializer<AdsCreditsDiscountsGet200Response> {
  @override
  final Iterable<Type> types = const [AdsCreditsDiscountsGet200Response, _$AdsCreditsDiscountsGet200Response];

  @override
  final String wireName = r'AdsCreditsDiscountsGet200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdsCreditsDiscountsGet200Response object, {
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
      specifiedType: const FullType(BuiltList, [FullType(JsonObject)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AdsCreditsDiscountsGet200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdsCreditsDiscountsGet200ResponseBuilder result,
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
            specifiedType: const FullType(BuiltList, [FullType(JsonObject)]),
          ) as BuiltList<JsonObject>;
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
  AdsCreditsDiscountsGet200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdsCreditsDiscountsGet200ResponseBuilder();
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

