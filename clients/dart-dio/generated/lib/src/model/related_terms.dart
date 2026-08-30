//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/related_terms_related_terms_list_items.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'related_terms.g.dart';

/// RelatedTerms
///
/// Properties:
/// * [id] - First input term. For example, if you pass \"?terms=clothes,workout\", then id will be \"clothes\"
/// * [relatedTermCount] - Total number of related terms returned
/// * [relatedTermsList] - The id of the advertiser.
@BuiltValue()
abstract class RelatedTerms implements Built<RelatedTerms, RelatedTermsBuilder> {
  /// First input term. For example, if you pass \"?terms=clothes,workout\", then id will be \"clothes\"
  @BuiltValueField(wireName: r'id')
  String? get id;

  /// Total number of related terms returned
  @BuiltValueField(wireName: r'related_term_count')
  int? get relatedTermCount;

  /// The id of the advertiser.
  @BuiltValueField(wireName: r'related_terms_list')
  BuiltList<RelatedTermsRelatedTermsListItems>? get relatedTermsList;

  RelatedTerms._();

  factory RelatedTerms([void updates(RelatedTermsBuilder b)]) = _$RelatedTerms;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(RelatedTermsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<RelatedTerms> get serializer => _$RelatedTermsSerializer();
}

class _$RelatedTermsSerializer implements PrimitiveSerializer<RelatedTerms> {
  @override
  final Iterable<Type> types = const [RelatedTerms, _$RelatedTerms];

  @override
  final String wireName = r'RelatedTerms';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    RelatedTerms object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
    if (object.relatedTermCount != null) {
      yield r'related_term_count';
      yield serializers.serialize(
        object.relatedTermCount,
        specifiedType: const FullType(int),
      );
    }
    if (object.relatedTermsList != null) {
      yield r'related_terms_list';
      yield serializers.serialize(
        object.relatedTermsList,
        specifiedType: const FullType(BuiltList, [FullType(RelatedTermsRelatedTermsListItems)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    RelatedTerms object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required RelatedTermsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.id = valueDes;
          break;
        case r'related_term_count':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.relatedTermCount = valueDes;
          break;
        case r'related_terms_list':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(RelatedTermsRelatedTermsListItems)]),
          ) as BuiltList<RelatedTermsRelatedTermsListItems>?;
          if (valueDes == null) continue;
          result.relatedTermsList.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  RelatedTerms deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = RelatedTermsBuilder();
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

