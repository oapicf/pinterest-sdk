//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/paginated.dart';
import 'package:openapi/src/model/audience.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audiences_list200_response.g.dart';

/// AudiencesList200Response
///
/// Properties:
/// * [bookmark] 
/// * [items] 
@BuiltValue()
abstract class AudiencesList200Response implements Paginated, Built<AudiencesList200Response, AudiencesList200ResponseBuilder> {
  AudiencesList200Response._();

  factory AudiencesList200Response([void updates(AudiencesList200ResponseBuilder b)]) = _$AudiencesList200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AudiencesList200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AudiencesList200Response> get serializer => _$AudiencesList200ResponseSerializer();
}

class _$AudiencesList200ResponseSerializer implements PrimitiveSerializer<AudiencesList200Response> {
  @override
  final Iterable<Type> types = const [AudiencesList200Response, _$AudiencesList200Response];

  @override
  final String wireName = r'AudiencesList200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AudiencesList200Response object, {
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
    AudiencesList200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AudiencesList200ResponseBuilder result,
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
  AudiencesList200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AudiencesList200ResponseBuilder();
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

