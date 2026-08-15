//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_create_request.g.dart';

/// Request object for creating a catalog.
///
/// Properties:
/// * [catalogType] 
/// * [name] - A human-friendly name associated to a given catalog.
@BuiltValue()
abstract class CatalogsCreateRequest implements Built<CatalogsCreateRequest, CatalogsCreateRequestBuilder> {
  @BuiltValueField(wireName: r'catalog_type')
  CatalogsType get catalogType;
  // enum catalogTypeEnum {  RETAIL,  HOTEL,  CREATIVE_ASSETS,  };

  /// A human-friendly name associated to a given catalog.
  @BuiltValueField(wireName: r'name')
  String get name;

  CatalogsCreateRequest._();

  factory CatalogsCreateRequest([void updates(CatalogsCreateRequestBuilder b)]) = _$CatalogsCreateRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsCreateRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsCreateRequest> get serializer => _$CatalogsCreateRequestSerializer();
}

class _$CatalogsCreateRequestSerializer implements PrimitiveSerializer<CatalogsCreateRequest> {
  @override
  final Iterable<Type> types = const [CatalogsCreateRequest, _$CatalogsCreateRequest];

  @override
  final String wireName = r'CatalogsCreateRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsCreateRequest object, {
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
    CatalogsCreateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsCreateRequestBuilder result,
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
  CatalogsCreateRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsCreateRequestBuilder();
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

