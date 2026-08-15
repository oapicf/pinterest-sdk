//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/paginated.dart';
import 'package:openapi/src/model/user_business_role_binding.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'get_business_employers200_response.g.dart';

/// GetBusinessEmployers200Response
///
/// Properties:
/// * [bookmark] 
/// * [items] - List of employers.
@BuiltValue()
abstract class GetBusinessEmployers200Response implements Paginated, Built<GetBusinessEmployers200Response, GetBusinessEmployers200ResponseBuilder> {
  GetBusinessEmployers200Response._();

  factory GetBusinessEmployers200Response([void updates(GetBusinessEmployers200ResponseBuilder b)]) = _$GetBusinessEmployers200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(GetBusinessEmployers200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<GetBusinessEmployers200Response> get serializer => _$GetBusinessEmployers200ResponseSerializer();
}

class _$GetBusinessEmployers200ResponseSerializer implements PrimitiveSerializer<GetBusinessEmployers200Response> {
  @override
  final Iterable<Type> types = const [GetBusinessEmployers200Response, _$GetBusinessEmployers200Response];

  @override
  final String wireName = r'GetBusinessEmployers200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    GetBusinessEmployers200Response object, {
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
    GetBusinessEmployers200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required GetBusinessEmployers200ResponseBuilder result,
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
  GetBusinessEmployers200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = GetBusinessEmployers200ResponseBuilder();
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

