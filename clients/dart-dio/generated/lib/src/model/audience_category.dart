//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/audience_subcategory.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audience_category.g.dart';

/// AudienceCategory
///
/// Properties:
/// * [id] - Interest ID.
/// * [index] - Interest affinity index.
/// * [key] - Interest unique key (same as ID).
/// * [name] - Interest name.
/// * [ratio] - Interest's percent of category's total audience.
/// * [subcategories] - Subcategory interest distribution
@BuiltValue()
abstract class AudienceCategory implements Built<AudienceCategory, AudienceCategoryBuilder> {
  /// Interest ID.
  @BuiltValueField(wireName: r'id')
  String? get id;

  /// Interest affinity index.
  @BuiltValueField(wireName: r'index')
  num? get index;

  /// Interest unique key (same as ID).
  @BuiltValueField(wireName: r'key')
  String? get key;

  /// Interest name.
  @BuiltValueField(wireName: r'name')
  String? get name;

  /// Interest's percent of category's total audience.
  @BuiltValueField(wireName: r'ratio')
  num? get ratio;

  /// Subcategory interest distribution
  @BuiltValueField(wireName: r'subcategories')
  BuiltList<AudienceSubcategory>? get subcategories;

  AudienceCategory._();

  factory AudienceCategory([void updates(AudienceCategoryBuilder b)]) = _$AudienceCategory;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AudienceCategoryBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AudienceCategory> get serializer => _$AudienceCategorySerializer();
}

class _$AudienceCategorySerializer implements PrimitiveSerializer<AudienceCategory> {
  @override
  final Iterable<Type> types = const [AudienceCategory, _$AudienceCategory];

  @override
  final String wireName = r'AudienceCategory';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AudienceCategory object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
    if (object.index != null) {
      yield r'index';
      yield serializers.serialize(
        object.index,
        specifiedType: const FullType(num),
      );
    }
    if (object.key != null) {
      yield r'key';
      yield serializers.serialize(
        object.key,
        specifiedType: const FullType(String),
      );
    }
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(String),
      );
    }
    if (object.ratio != null) {
      yield r'ratio';
      yield serializers.serialize(
        object.ratio,
        specifiedType: const FullType(num),
      );
    }
    if (object.subcategories != null) {
      yield r'subcategories';
      yield serializers.serialize(
        object.subcategories,
        specifiedType: const FullType(BuiltList, [FullType(AudienceSubcategory)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AudienceCategory object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AudienceCategoryBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'index':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.index = valueDes;
          break;
        case r'key':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.key = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'ratio':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.ratio = valueDes;
          break;
        case r'subcategories':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AudienceSubcategory)]),
          ) as BuiltList<AudienceSubcategory>;
          result.subcategories.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AudienceCategory deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AudienceCategoryBuilder();
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

