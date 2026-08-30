//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/local_store.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_local_stores_list200_response.g.dart';

/// CatalogsLocalStoresList200Response
///
/// Properties:
/// * [bookmark] 
/// * [items] 
@BuiltValue()
abstract class CatalogsLocalStoresList200Response implements Built<CatalogsLocalStoresList200Response, CatalogsLocalStoresList200ResponseBuilder> {
  @BuiltValueField(wireName: r'bookmark')
  String? get bookmark;

  @BuiltValueField(wireName: r'items')
  BuiltList<LocalStore> get items;

  CatalogsLocalStoresList200Response._();

  factory CatalogsLocalStoresList200Response([void updates(CatalogsLocalStoresList200ResponseBuilder b)]) = _$CatalogsLocalStoresList200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsLocalStoresList200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsLocalStoresList200Response> get serializer => _$CatalogsLocalStoresList200ResponseSerializer();
}

class _$CatalogsLocalStoresList200ResponseSerializer implements PrimitiveSerializer<CatalogsLocalStoresList200Response> {
  @override
  final Iterable<Type> types = const [CatalogsLocalStoresList200Response, _$CatalogsLocalStoresList200Response];

  @override
  final String wireName = r'CatalogsLocalStoresList200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsLocalStoresList200Response object, {
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
      specifiedType: const FullType(BuiltList, [FullType(LocalStore)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsLocalStoresList200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsLocalStoresList200ResponseBuilder result,
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
            specifiedType: const FullType(BuiltList, [FullType(LocalStore)]),
          ) as BuiltList<LocalStore>;
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
  CatalogsLocalStoresList200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsLocalStoresList200ResponseBuilder();
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

