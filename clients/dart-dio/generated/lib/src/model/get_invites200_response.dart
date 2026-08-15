//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/invite_response.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/paginated.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'get_invites200_response.g.dart';

/// GetInvites200Response
///
/// Properties:
/// * [bookmark] 
/// * [items] - List of invite and request data.
@BuiltValue()
abstract class GetInvites200Response implements Paginated, Built<GetInvites200Response, GetInvites200ResponseBuilder> {
  GetInvites200Response._();

  factory GetInvites200Response([void updates(GetInvites200ResponseBuilder b)]) = _$GetInvites200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(GetInvites200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<GetInvites200Response> get serializer => _$GetInvites200ResponseSerializer();
}

class _$GetInvites200ResponseSerializer implements PrimitiveSerializer<GetInvites200Response> {
  @override
  final Iterable<Type> types = const [GetInvites200Response, _$GetInvites200Response];

  @override
  final String wireName = r'GetInvites200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    GetInvites200Response object, {
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
    GetInvites200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required GetInvites200ResponseBuilder result,
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
  GetInvites200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = GetInvites200ResponseBuilder();
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

