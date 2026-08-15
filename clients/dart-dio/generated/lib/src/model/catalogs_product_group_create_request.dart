//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_product_group_filters_request.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_product_group_create_request.g.dart';

/// Request object for creating a product group.
///
/// Properties:
/// * [description] 
/// * [feedId] - Catalog Feed id pertaining to the catalog product group.
/// * [filters] 
/// * [isFeatured] - boolean indicator of whether the product group is being featured or not
/// * [name] 
@BuiltValue()
abstract class CatalogsProductGroupCreateRequest implements Built<CatalogsProductGroupCreateRequest, CatalogsProductGroupCreateRequestBuilder> {
  @BuiltValueField(wireName: r'description')
  String? get description;

  /// Catalog Feed id pertaining to the catalog product group.
  @BuiltValueField(wireName: r'feed_id')
  String get feedId;

  @BuiltValueField(wireName: r'filters')
  CatalogsProductGroupFiltersRequest get filters;

  /// boolean indicator of whether the product group is being featured or not
  @Deprecated('isFeatured has been deprecated')
  @BuiltValueField(wireName: r'is_featured')
  bool? get isFeatured;

  @BuiltValueField(wireName: r'name')
  String get name;

  CatalogsProductGroupCreateRequest._();

  factory CatalogsProductGroupCreateRequest([void updates(CatalogsProductGroupCreateRequestBuilder b)]) = _$CatalogsProductGroupCreateRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsProductGroupCreateRequestBuilder b) => b
      ..isFeatured = false;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsProductGroupCreateRequest> get serializer => _$CatalogsProductGroupCreateRequestSerializer();
}

class _$CatalogsProductGroupCreateRequestSerializer implements PrimitiveSerializer<CatalogsProductGroupCreateRequest> {
  @override
  final Iterable<Type> types = const [CatalogsProductGroupCreateRequest, _$CatalogsProductGroupCreateRequest];

  @override
  final String wireName = r'CatalogsProductGroupCreateRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsProductGroupCreateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType.nullable(String),
      );
    }
    yield r'feed_id';
    yield serializers.serialize(
      object.feedId,
      specifiedType: const FullType(String),
    );
    yield r'filters';
    yield serializers.serialize(
      object.filters,
      specifiedType: const FullType(CatalogsProductGroupFiltersRequest),
    );
    if (object.isFeatured != null) {
      yield r'is_featured';
      yield serializers.serialize(
        object.isFeatured,
        specifiedType: const FullType(bool),
      );
    }
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsProductGroupCreateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsProductGroupCreateRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.description = valueDes;
          break;
        case r'feed_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.feedId = valueDes;
          break;
        case r'filters':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsProductGroupFiltersRequest),
          ) as CatalogsProductGroupFiltersRequest;
          result.filters.replace(valueDes);
          break;
        case r'is_featured':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.isFeatured = valueDes;
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
  CatalogsProductGroupCreateRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsProductGroupCreateRequestBuilder();
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

