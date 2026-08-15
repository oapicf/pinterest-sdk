//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/paginated.dart';
import 'package:openapi/src/model/user_business_role_binding.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'get_business_partners200_response.g.dart';

/// GetBusinessPartners200Response
///
/// Properties:
/// * [bookmark] 
/// * [items] - List of business partners.
@BuiltValue()
abstract class GetBusinessPartners200Response implements Paginated, Built<GetBusinessPartners200Response, GetBusinessPartners200ResponseBuilder> {
  GetBusinessPartners200Response._();

  factory GetBusinessPartners200Response([void updates(GetBusinessPartners200ResponseBuilder b)]) = _$GetBusinessPartners200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(GetBusinessPartners200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<GetBusinessPartners200Response> get serializer => _$GetBusinessPartners200ResponseSerializer();
}

class _$GetBusinessPartners200ResponseSerializer implements PrimitiveSerializer<GetBusinessPartners200Response> {
  @override
  final Iterable<Type> types = const [GetBusinessPartners200Response, _$GetBusinessPartners200Response];

  @override
  final String wireName = r'GetBusinessPartners200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    GetBusinessPartners200Response object, {
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
    GetBusinessPartners200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required GetBusinessPartners200ResponseBuilder result,
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
  GetBusinessPartners200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = GetBusinessPartners200ResponseBuilder();
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

