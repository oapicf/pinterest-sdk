//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_item_validation_issues.dart';
import 'package:openapi/src/model/paginated.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'items_issues_list200_response.g.dart';

/// ItemsIssuesList200Response
///
/// Properties:
/// * [bookmark] 
/// * [items] 
@BuiltValue()
abstract class ItemsIssuesList200Response implements Paginated, Built<ItemsIssuesList200Response, ItemsIssuesList200ResponseBuilder> {
  ItemsIssuesList200Response._();

  factory ItemsIssuesList200Response([void updates(ItemsIssuesList200ResponseBuilder b)]) = _$ItemsIssuesList200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ItemsIssuesList200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ItemsIssuesList200Response> get serializer => _$ItemsIssuesList200ResponseSerializer();
}

class _$ItemsIssuesList200ResponseSerializer implements PrimitiveSerializer<ItemsIssuesList200Response> {
  @override
  final Iterable<Type> types = const [ItemsIssuesList200Response, _$ItemsIssuesList200Response];

  @override
  final String wireName = r'ItemsIssuesList200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ItemsIssuesList200Response object, {
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
    ItemsIssuesList200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ItemsIssuesList200ResponseBuilder result,
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
  ItemsIssuesList200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ItemsIssuesList200ResponseBuilder();
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

