//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/paginated.dart';
import 'package:openapi/src/model/pin.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'search_user_pins_list200_response.g.dart';

/// SearchUserPinsList200Response
///
/// Properties:
/// * [bookmark] 
/// * [items] 
@BuiltValue()
abstract class SearchUserPinsList200Response implements Paginated, Built<SearchUserPinsList200Response, SearchUserPinsList200ResponseBuilder> {
  SearchUserPinsList200Response._();

  factory SearchUserPinsList200Response([void updates(SearchUserPinsList200ResponseBuilder b)]) = _$SearchUserPinsList200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(SearchUserPinsList200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<SearchUserPinsList200Response> get serializer => _$SearchUserPinsList200ResponseSerializer();
}

class _$SearchUserPinsList200ResponseSerializer implements PrimitiveSerializer<SearchUserPinsList200Response> {
  @override
  final Iterable<Type> types = const [SearchUserPinsList200Response, _$SearchUserPinsList200Response];

  @override
  final String wireName = r'SearchUserPinsList200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    SearchUserPinsList200Response object, {
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
    SearchUserPinsList200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required SearchUserPinsList200ResponseBuilder result,
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
  SearchUserPinsList200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = SearchUserPinsList200ResponseBuilder();
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

