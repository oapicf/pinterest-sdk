//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_product_group_multiple_media_types_criteria.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'media_type_filter.g.dart';

/// MediaTypeFilter
///
/// Properties:
/// * [MEDIA_TYPE] 
@BuiltValue()
abstract class MediaTypeFilter implements Built<MediaTypeFilter, MediaTypeFilterBuilder> {
  @BuiltValueField(wireName: r'MEDIA_TYPE')
  CatalogsProductGroupMultipleMediaTypesCriteria get MEDIA_TYPE;

  MediaTypeFilter._();

  factory MediaTypeFilter([void updates(MediaTypeFilterBuilder b)]) = _$MediaTypeFilter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MediaTypeFilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MediaTypeFilter> get serializer => _$MediaTypeFilterSerializer();
}

class _$MediaTypeFilterSerializer implements PrimitiveSerializer<MediaTypeFilter> {
  @override
  final Iterable<Type> types = const [MediaTypeFilter, _$MediaTypeFilter];

  @override
  final String wireName = r'MediaTypeFilter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MediaTypeFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'MEDIA_TYPE';
    yield serializers.serialize(
      object.MEDIA_TYPE,
      specifiedType: const FullType(CatalogsProductGroupMultipleMediaTypesCriteria),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    MediaTypeFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MediaTypeFilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'MEDIA_TYPE':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsProductGroupMultipleMediaTypesCriteria),
          ) as CatalogsProductGroupMultipleMediaTypesCriteria;
          result.MEDIA_TYPE.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  MediaTypeFilter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MediaTypeFilterBuilder();
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

