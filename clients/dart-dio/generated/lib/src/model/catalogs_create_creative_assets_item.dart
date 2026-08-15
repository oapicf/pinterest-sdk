//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_creative_assets_attributes.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_create_creative_assets_item.g.dart';

/// A creative assets item to be created.
///
/// Properties:
/// * [attributes] 
/// * [creativeAssetsId] - The catalog creative assets id in the merchant namespace
/// * [operation] 
@BuiltValue()
abstract class CatalogsCreateCreativeAssetsItem implements Built<CatalogsCreateCreativeAssetsItem, CatalogsCreateCreativeAssetsItemBuilder> {
  @BuiltValueField(wireName: r'attributes')
  CatalogsCreativeAssetsAttributes get attributes;

  /// The catalog creative assets id in the merchant namespace
  @BuiltValueField(wireName: r'creative_assets_id')
  String get creativeAssetsId;

  @BuiltValueField(wireName: r'operation')
  CatalogsCreateCreativeAssetsItemOperationEnum get operation;
  // enum operationEnum {  CREATE,  };

  CatalogsCreateCreativeAssetsItem._();

  factory CatalogsCreateCreativeAssetsItem([void updates(CatalogsCreateCreativeAssetsItemBuilder b)]) = _$CatalogsCreateCreativeAssetsItem;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsCreateCreativeAssetsItemBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsCreateCreativeAssetsItem> get serializer => _$CatalogsCreateCreativeAssetsItemSerializer();
}

class _$CatalogsCreateCreativeAssetsItemSerializer implements PrimitiveSerializer<CatalogsCreateCreativeAssetsItem> {
  @override
  final Iterable<Type> types = const [CatalogsCreateCreativeAssetsItem, _$CatalogsCreateCreativeAssetsItem];

  @override
  final String wireName = r'CatalogsCreateCreativeAssetsItem';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsCreateCreativeAssetsItem object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'attributes';
    yield serializers.serialize(
      object.attributes,
      specifiedType: const FullType(CatalogsCreativeAssetsAttributes),
    );
    yield r'creative_assets_id';
    yield serializers.serialize(
      object.creativeAssetsId,
      specifiedType: const FullType(String),
    );
    yield r'operation';
    yield serializers.serialize(
      object.operation,
      specifiedType: const FullType(CatalogsCreateCreativeAssetsItemOperationEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsCreateCreativeAssetsItem object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsCreateCreativeAssetsItemBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'attributes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsCreativeAssetsAttributes),
          ) as CatalogsCreativeAssetsAttributes;
          result.attributes.replace(valueDes);
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
            specifiedType: const FullType(CatalogsCreateCreativeAssetsItemOperationEnum),
          ) as CatalogsCreateCreativeAssetsItemOperationEnum;
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
  CatalogsCreateCreativeAssetsItem deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsCreateCreativeAssetsItemBuilder();
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

class CatalogsCreateCreativeAssetsItemOperationEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'CREATE')
  static const CatalogsCreateCreativeAssetsItemOperationEnum CREATE = _$catalogsCreateCreativeAssetsItemOperationEnum_CREATE;

  static Serializer<CatalogsCreateCreativeAssetsItemOperationEnum> get serializer => _$catalogsCreateCreativeAssetsItemOperationEnumSerializer;

  const CatalogsCreateCreativeAssetsItemOperationEnum._(String name): super(name);

  static BuiltSet<CatalogsCreateCreativeAssetsItemOperationEnum> get values => _$catalogsCreateCreativeAssetsItemOperationEnumValues;
  static CatalogsCreateCreativeAssetsItemOperationEnum valueOf(String name) => _$catalogsCreateCreativeAssetsItemOperationEnumValueOf(name);
}

