//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_delete_creative_assets_item.g.dart';

/// A creative assets item to be deleted
///
/// Properties:
/// * [creativeAssetsId] - The catalog creative assets id in the merchant namespace
/// * [operation] 
@BuiltValue()
abstract class CatalogsDeleteCreativeAssetsItem implements Built<CatalogsDeleteCreativeAssetsItem, CatalogsDeleteCreativeAssetsItemBuilder> {
  /// The catalog creative assets id in the merchant namespace
  @BuiltValueField(wireName: r'creative_assets_id')
  String get creativeAssetsId;

  @BuiltValueField(wireName: r'operation')
  CatalogsDeleteCreativeAssetsItemOperationEnum get operation;
  // enum operationEnum {  DELETE,  };

  CatalogsDeleteCreativeAssetsItem._();

  factory CatalogsDeleteCreativeAssetsItem([void updates(CatalogsDeleteCreativeAssetsItemBuilder b)]) = _$CatalogsDeleteCreativeAssetsItem;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsDeleteCreativeAssetsItemBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsDeleteCreativeAssetsItem> get serializer => _$CatalogsDeleteCreativeAssetsItemSerializer();
}

class _$CatalogsDeleteCreativeAssetsItemSerializer implements PrimitiveSerializer<CatalogsDeleteCreativeAssetsItem> {
  @override
  final Iterable<Type> types = const [CatalogsDeleteCreativeAssetsItem, _$CatalogsDeleteCreativeAssetsItem];

  @override
  final String wireName = r'CatalogsDeleteCreativeAssetsItem';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsDeleteCreativeAssetsItem object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'creative_assets_id';
    yield serializers.serialize(
      object.creativeAssetsId,
      specifiedType: const FullType(String),
    );
    yield r'operation';
    yield serializers.serialize(
      object.operation,
      specifiedType: const FullType(CatalogsDeleteCreativeAssetsItemOperationEnum),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsDeleteCreativeAssetsItem object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsDeleteCreativeAssetsItemBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
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
            specifiedType: const FullType(CatalogsDeleteCreativeAssetsItemOperationEnum),
          ) as CatalogsDeleteCreativeAssetsItemOperationEnum;
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
  CatalogsDeleteCreativeAssetsItem deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsDeleteCreativeAssetsItemBuilder();
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

class CatalogsDeleteCreativeAssetsItemOperationEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'DELETE')
  static const CatalogsDeleteCreativeAssetsItemOperationEnum DELETE = _$catalogsDeleteCreativeAssetsItemOperationEnum_DELETE;

  static Serializer<CatalogsDeleteCreativeAssetsItemOperationEnum> get serializer => _$catalogsDeleteCreativeAssetsItemOperationEnumSerializer;

  const CatalogsDeleteCreativeAssetsItemOperationEnum._(String name): super(name);

  static BuiltSet<CatalogsDeleteCreativeAssetsItemOperationEnum> get values => _$catalogsDeleteCreativeAssetsItemOperationEnumValues;
  static CatalogsDeleteCreativeAssetsItemOperationEnum valueOf(String name) => _$catalogsDeleteCreativeAssetsItemOperationEnumValueOf(name);
}

