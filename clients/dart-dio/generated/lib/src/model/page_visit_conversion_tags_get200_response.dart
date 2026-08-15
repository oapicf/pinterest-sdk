//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/paginated.dart';
import 'package:openapi/src/model/conversion_event_response.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'page_visit_conversion_tags_get200_response.g.dart';

/// PageVisitConversionTagsGet200Response
///
/// Properties:
/// * [bookmark] 
/// * [items] 
@BuiltValue()
abstract class PageVisitConversionTagsGet200Response implements Paginated, Built<PageVisitConversionTagsGet200Response, PageVisitConversionTagsGet200ResponseBuilder> {
  PageVisitConversionTagsGet200Response._();

  factory PageVisitConversionTagsGet200Response([void updates(PageVisitConversionTagsGet200ResponseBuilder b)]) = _$PageVisitConversionTagsGet200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PageVisitConversionTagsGet200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PageVisitConversionTagsGet200Response> get serializer => _$PageVisitConversionTagsGet200ResponseSerializer();
}

class _$PageVisitConversionTagsGet200ResponseSerializer implements PrimitiveSerializer<PageVisitConversionTagsGet200Response> {
  @override
  final Iterable<Type> types = const [PageVisitConversionTagsGet200Response, _$PageVisitConversionTagsGet200Response];

  @override
  final String wireName = r'PageVisitConversionTagsGet200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PageVisitConversionTagsGet200Response object, {
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
    PageVisitConversionTagsGet200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PageVisitConversionTagsGet200ResponseBuilder result,
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
  PageVisitConversionTagsGet200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PageVisitConversionTagsGet200ResponseBuilder();
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

