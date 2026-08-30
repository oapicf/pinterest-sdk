//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_product_group_update_request.dart';
import 'package:openapi/src/model/catalogs_product_group_filters_request.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_product_group_update_many_request_items_one_of_items0.g.dart';

/// CatalogsProductGroupUpdateManyRequestItemsOneOfItems0
///
/// Properties:
/// * [description] 
/// * [filters] 
/// * [isFeatured] - boolean indicator of whether the product group is being featured or not
/// * [name] 
/// * [id] - ID of the product group.
@BuiltValue()
abstract class CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 implements CatalogsProductGroupUpdateRequest, Built<CatalogsProductGroupUpdateManyRequestItemsOneOfItems0, CatalogsProductGroupUpdateManyRequestItemsOneOfItems0Builder> {
  /// ID of the product group.
  @BuiltValueField(wireName: r'id')
  String get id;

  CatalogsProductGroupUpdateManyRequestItemsOneOfItems0._();

  factory CatalogsProductGroupUpdateManyRequestItemsOneOfItems0([void updates(CatalogsProductGroupUpdateManyRequestItemsOneOfItems0Builder b)]) = _$CatalogsProductGroupUpdateManyRequestItemsOneOfItems0;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsProductGroupUpdateManyRequestItemsOneOfItems0Builder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsProductGroupUpdateManyRequestItemsOneOfItems0> get serializer => _$CatalogsProductGroupUpdateManyRequestItemsOneOfItems0Serializer();
}

class _$CatalogsProductGroupUpdateManyRequestItemsOneOfItems0Serializer implements PrimitiveSerializer<CatalogsProductGroupUpdateManyRequestItemsOneOfItems0> {
  @override
  final Iterable<Type> types = const [CatalogsProductGroupUpdateManyRequestItemsOneOfItems0, _$CatalogsProductGroupUpdateManyRequestItemsOneOfItems0];

  @override
  final String wireName = r'CatalogsProductGroupUpdateManyRequestItemsOneOfItems0';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(String),
      );
    }
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType.nullable(String),
      );
    }
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    if (object.filters != null) {
      yield r'filters';
      yield serializers.serialize(
        object.filters,
        specifiedType: const FullType(CatalogsProductGroupFiltersRequest),
      );
    }
    if (object.isFeatured != null) {
      yield r'is_featured';
      yield serializers.serialize(
        object.isFeatured,
        specifiedType: const FullType(bool),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsProductGroupUpdateManyRequestItemsOneOfItems0Builder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.name = valueDes;
          break;
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.description = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'filters':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CatalogsProductGroupFiltersRequest),
          ) as CatalogsProductGroupFiltersRequest?;
          if (valueDes == null) continue;
          result.filters.replace(valueDes);
          break;
        case r'is_featured':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isFeatured = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsProductGroupUpdateManyRequestItemsOneOfItems0Builder();
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

