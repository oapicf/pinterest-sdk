//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalog_update.g.dart';

/// Resource create or update operation model.
///
/// Properties:
/// * [catalogType] 
/// * [name] - A human-friendly name associated to a catalog entity.
@BuiltValue()
abstract class CatalogUpdate implements Built<CatalogUpdate, CatalogUpdateBuilder> {
  @BuiltValueField(wireName: r'catalog_type')
  CatalogsType? get catalogType;
  // enum catalogTypeEnum {  RETAIL,  HOTEL,  CREATIVE_ASSETS,  };

  /// A human-friendly name associated to a catalog entity.
  @BuiltValueField(wireName: r'name')
  String? get name;

  CatalogUpdate._();

  factory CatalogUpdate([void updates(CatalogUpdateBuilder b)]) = _$CatalogUpdate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogUpdateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogUpdate> get serializer => _$CatalogUpdateSerializer();
}

class _$CatalogUpdateSerializer implements PrimitiveSerializer<CatalogUpdate> {
  @override
  final Iterable<Type> types = const [CatalogUpdate, _$CatalogUpdate];

  @override
  final String wireName = r'CatalogUpdate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogUpdate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.catalogType != null) {
      yield r'catalog_type';
      yield serializers.serialize(
        object.catalogType,
        specifiedType: const FullType(CatalogsType),
      );
    }
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogUpdate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogUpdateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'catalog_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CatalogsType),
          ) as CatalogsType?;
          if (valueDes == null) continue;
          result.catalogType = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.name = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogUpdate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogUpdateBuilder();
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

