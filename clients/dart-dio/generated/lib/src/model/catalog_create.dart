//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalog_create.g.dart';

/// Resource create operation model.
///
/// Properties:
/// * [catalogType] 
/// * [name] - A human-friendly name associated to a catalog entity.
@BuiltValue()
abstract class CatalogCreate implements Built<CatalogCreate, CatalogCreateBuilder> {
  @BuiltValueField(wireName: r'catalog_type')
  CatalogsType get catalogType;
  // enum catalogTypeEnum {  RETAIL,  HOTEL,  CREATIVE_ASSETS,  };

  /// A human-friendly name associated to a catalog entity.
  @BuiltValueField(wireName: r'name')
  String get name;

  CatalogCreate._();

  factory CatalogCreate([void updates(CatalogCreateBuilder b)]) = _$CatalogCreate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogCreateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogCreate> get serializer => _$CatalogCreateSerializer();
}

class _$CatalogCreateSerializer implements PrimitiveSerializer<CatalogCreate> {
  @override
  final Iterable<Type> types = const [CatalogCreate, _$CatalogCreate];

  @override
  final String wireName = r'CatalogCreate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'catalog_type';
    yield serializers.serialize(
      object.catalogType,
      specifiedType: const FullType(CatalogsType),
    );
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogCreateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'catalog_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsType),
          ) as CatalogsType;
          result.catalogType = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
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
  CatalogCreate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogCreateBuilder();
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

