//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_updatable_creative_assets_attributes.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_update_creative_assets_item.g.dart';

/// A creative assets item to be updated.
///
/// Properties:
/// * [attributes] 
/// * [creativeAssetsId] - The catalog creative assets item id in the merchant namespace
/// * [operation] 
@BuiltValue()
abstract class CatalogsUpdateCreativeAssetsItem implements Built<CatalogsUpdateCreativeAssetsItem, CatalogsUpdateCreativeAssetsItemBuilder> {
  @BuiltValueField(wireName: r'attributes')
  CatalogsUpdatableCreativeAssetsAttributes get attributes;

  /// The catalog creative assets item id in the merchant namespace
  @BuiltValueField(wireName: r'creative_assets_id')
  String get creativeAssetsId;

  @BuiltValueField(wireName: r'operation')
  CatalogsUpdateCreativeAssetsItemOperationEnum get operation;
  // enum operationEnum {  UPDATE,  };

  CatalogsUpdateCreativeAssetsItem._();

  factory CatalogsUpdateCreativeAssetsItem([void updates(CatalogsUpdateCreativeAssetsItemBuilder b)]) = _$CatalogsUpdateCreativeAssetsItem;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsUpdateCreativeAssetsItemBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsUpdateCreativeAssetsItem> get serializer => _$CatalogsUpdateCreativeAssetsItemSerializer();
}

class _$CatalogsUpdateCreativeAssetsItemSerializer implements PrimitiveSerializer<CatalogsUpdateCreativeAssetsItem> {
  @override
  final Iterable<Type> types = const [CatalogsUpdateCreativeAssetsItem, _$CatalogsUpdateCreativeAssetsItem];

  @override
  final String wireName = r'CatalogsUpdateCreativeAssetsItem';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsUpdateCreativeAssetsItem object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'attributes';
    yield serializers.serialize(
      object.attributes,
      specifiedType: const FullType(CatalogsUpdatableCreativeAssetsAttributes),
    );
    yield r'creative_assets_id';
    yield serializers.serialize(
      object.creativeAssetsId,
      specifiedType: const FullType(String),
    );
    yield r'operation';
    yield serializers.serialize(
      object.operation,
      specifiedType: const FullType(CatalogsUpdateCreativeAssetsItemOperationEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsUpdateCreativeAssetsItem object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsUpdateCreativeAssetsItemBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'attributes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsUpdatableCreativeAssetsAttributes),
          ) as CatalogsUpdatableCreativeAssetsAttributes;
          result.attributes = valueDes;
          break;
        case r'creative_assets_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.creativeAssetsId = valueDes;
          break;
        case r'operation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsUpdateCreativeAssetsItemOperationEnum),
          ) as CatalogsUpdateCreativeAssetsItemOperationEnum;
          result.operation = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsUpdateCreativeAssetsItem deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsUpdateCreativeAssetsItemBuilder();
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

class CatalogsUpdateCreativeAssetsItemOperationEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'UPDATE')
  static const CatalogsUpdateCreativeAssetsItemOperationEnum UPDATE = _$catalogsUpdateCreativeAssetsItemOperationEnum_UPDATE;

  static Serializer<CatalogsUpdateCreativeAssetsItemOperationEnum> get serializer => _$catalogsUpdateCreativeAssetsItemOperationEnumSerializer;

  const CatalogsUpdateCreativeAssetsItemOperationEnum._(String name): super(name);

  static BuiltSet<CatalogsUpdateCreativeAssetsItemOperationEnum> get values => _$catalogsUpdateCreativeAssetsItemOperationEnumValues;
  static CatalogsUpdateCreativeAssetsItemOperationEnum valueOf(String name) => _$catalogsUpdateCreativeAssetsItemOperationEnumValueOf(name);
}

