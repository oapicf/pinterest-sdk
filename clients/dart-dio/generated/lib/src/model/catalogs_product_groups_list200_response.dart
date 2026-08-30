//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_vertical_product_group.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_product_groups_list200_response.g.dart';

/// CatalogsProductGroupsList200Response
///
/// Properties:
/// * [bookmark] 
/// * [items] 
@BuiltValue()
abstract class CatalogsProductGroupsList200Response implements Built<CatalogsProductGroupsList200Response, CatalogsProductGroupsList200ResponseBuilder> {
  @BuiltValueField(wireName: r'bookmark')
  String? get bookmark;

  @BuiltValueField(wireName: r'items')
  BuiltList<CatalogsVerticalProductGroup> get items;

  CatalogsProductGroupsList200Response._();

  factory CatalogsProductGroupsList200Response([void updates(CatalogsProductGroupsList200ResponseBuilder b)]) = _$CatalogsProductGroupsList200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsProductGroupsList200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsProductGroupsList200Response> get serializer => _$CatalogsProductGroupsList200ResponseSerializer();
}

class _$CatalogsProductGroupsList200ResponseSerializer implements PrimitiveSerializer<CatalogsProductGroupsList200Response> {
  @override
  final Iterable<Type> types = const [CatalogsProductGroupsList200Response, _$CatalogsProductGroupsList200Response];

  @override
  final String wireName = r'CatalogsProductGroupsList200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsProductGroupsList200Response object, {
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
      specifiedType: const FullType(BuiltList, [FullType(CatalogsVerticalProductGroup)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsProductGroupsList200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsProductGroupsList200ResponseBuilder result,
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
            specifiedType: const FullType(BuiltList, [FullType(CatalogsVerticalProductGroup)]),
          ) as BuiltList<CatalogsVerticalProductGroup>;
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
  CatalogsProductGroupsList200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsProductGroupsList200ResponseBuilder();
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

