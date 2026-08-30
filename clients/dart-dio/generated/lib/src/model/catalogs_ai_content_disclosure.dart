//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_ai_content_disclosure_label.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_ai_content_disclosure.g.dart';

/// AI content disclosure for a single asset of a catalog item.
///
/// Properties:
/// * [disclosure] - Disclosure labels that apply to this asset.
/// * [url] - URL of the asset. Must match one of image_link, additional_image_link, or video_link.
@BuiltValue()
abstract class CatalogsAiContentDisclosure implements Built<CatalogsAiContentDisclosure, CatalogsAiContentDisclosureBuilder> {
  /// Disclosure labels that apply to this asset.
  @BuiltValueField(wireName: r'disclosure')
  BuiltList<CatalogsAiContentDisclosureLabel> get disclosure;

  /// URL of the asset. Must match one of image_link, additional_image_link, or video_link.
  @BuiltValueField(wireName: r'url')
  String get url;

  CatalogsAiContentDisclosure._();

  factory CatalogsAiContentDisclosure([void updates(CatalogsAiContentDisclosureBuilder b)]) = _$CatalogsAiContentDisclosure;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsAiContentDisclosureBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsAiContentDisclosure> get serializer => _$CatalogsAiContentDisclosureSerializer();
}

class _$CatalogsAiContentDisclosureSerializer implements PrimitiveSerializer<CatalogsAiContentDisclosure> {
  @override
  final Iterable<Type> types = const [CatalogsAiContentDisclosure, _$CatalogsAiContentDisclosure];

  @override
  final String wireName = r'CatalogsAiContentDisclosure';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsAiContentDisclosure object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'disclosure';
    yield serializers.serialize(
      object.disclosure,
      specifiedType: const FullType(BuiltList, [FullType(CatalogsAiContentDisclosureLabel)]),
    );
    yield r'url';
    yield serializers.serialize(
      object.url,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsAiContentDisclosure object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsAiContentDisclosureBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'disclosure':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(CatalogsAiContentDisclosureLabel)]),
          ) as BuiltList<CatalogsAiContentDisclosureLabel>;
          result.disclosure.replace(valueDes);
          break;
        case r'url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.url = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsAiContentDisclosure deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsAiContentDisclosureBuilder();
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

