//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_product_group_filters_request.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_product_group_update_request.g.dart';

/// Request object for updating a product group.
///
/// Properties:
/// * [description] 
/// * [filters] 
/// * [isFeatured] - boolean indicator of whether the product group is being featured or not
/// * [name] 
@BuiltValue()
abstract class CatalogsProductGroupUpdateRequest implements Built<CatalogsProductGroupUpdateRequest, CatalogsProductGroupUpdateRequestBuilder> {
  @BuiltValueField(wireName: r'description')
  String? get description;

  @BuiltValueField(wireName: r'filters')
  CatalogsProductGroupFiltersRequest? get filters;

  /// boolean indicator of whether the product group is being featured or not
  @Deprecated('isFeatured has been deprecated')
  @BuiltValueField(wireName: r'is_featured')
  bool? get isFeatured;

  @BuiltValueField(wireName: r'name')
  String? get name;

  CatalogsProductGroupUpdateRequest._();

  factory CatalogsProductGroupUpdateRequest([void updates(CatalogsProductGroupUpdateRequestBuilder b)]) = _$CatalogsProductGroupUpdateRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsProductGroupUpdateRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsProductGroupUpdateRequest> get serializer => _$CatalogsProductGroupUpdateRequestSerializer();
}

class _$CatalogsProductGroupUpdateRequestSerializer implements PrimitiveSerializer<CatalogsProductGroupUpdateRequest> {
  @override
  final Iterable<Type> types = const [CatalogsProductGroupUpdateRequest, _$CatalogsProductGroupUpdateRequest];

  @override
  final String wireName = r'CatalogsProductGroupUpdateRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsProductGroupUpdateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.description != null) {
      yield r'description';
      yield serializers.serialize(
        object.description,
        specifiedType: const FullType.nullable(String),
      );
    }
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
    CatalogsProductGroupUpdateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsProductGroupUpdateRequestBuilder result,
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
  CatalogsProductGroupUpdateRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsProductGroupUpdateRequestBuilder();
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

