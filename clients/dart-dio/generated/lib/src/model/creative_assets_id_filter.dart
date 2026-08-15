//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_product_group_multiple_string_criteria.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'creative_assets_id_filter.g.dart';

/// CreativeAssetsIdFilter
///
/// Properties:
/// * [CREATIVE_ASSETS_ID] 
@BuiltValue()
abstract class CreativeAssetsIdFilter implements Built<CreativeAssetsIdFilter, CreativeAssetsIdFilterBuilder> {
  @BuiltValueField(wireName: r'CREATIVE_ASSETS_ID')
  CatalogsProductGroupMultipleStringCriteria get CREATIVE_ASSETS_ID;

  CreativeAssetsIdFilter._();

  factory CreativeAssetsIdFilter([void updates(CreativeAssetsIdFilterBuilder b)]) = _$CreativeAssetsIdFilter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreativeAssetsIdFilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreativeAssetsIdFilter> get serializer => _$CreativeAssetsIdFilterSerializer();
}

class _$CreativeAssetsIdFilterSerializer implements PrimitiveSerializer<CreativeAssetsIdFilter> {
  @override
  final Iterable<Type> types = const [CreativeAssetsIdFilter, _$CreativeAssetsIdFilter];

  @override
  final String wireName = r'CreativeAssetsIdFilter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreativeAssetsIdFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'CREATIVE_ASSETS_ID';
    yield serializers.serialize(
      object.CREATIVE_ASSETS_ID,
      specifiedType: const FullType(CatalogsProductGroupMultipleStringCriteria),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CreativeAssetsIdFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreativeAssetsIdFilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'CREATIVE_ASSETS_ID':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsProductGroupMultipleStringCriteria),
          ) as CatalogsProductGroupMultipleStringCriteria;
          result.CREATIVE_ASSETS_ID = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CreativeAssetsIdFilter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreativeAssetsIdFilterBuilder();
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

