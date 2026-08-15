//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_feed_product_counts.g.dart';

/// The counts can be null early in the process.
///
/// Properties:
/// * [ingested] - The number of products successfully ingested from the feed file.
/// * [original] - The number of products in the feed file.
@BuiltValue()
abstract class CatalogsFeedProductCounts implements Built<CatalogsFeedProductCounts, CatalogsFeedProductCountsBuilder> {
  /// The number of products successfully ingested from the feed file.
  @BuiltValueField(wireName: r'ingested')
  int? get ingested;

  /// The number of products in the feed file.
  @BuiltValueField(wireName: r'original')
  int? get original;

  CatalogsFeedProductCounts._();

  factory CatalogsFeedProductCounts([void updates(CatalogsFeedProductCountsBuilder b)]) = _$CatalogsFeedProductCounts;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsFeedProductCountsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsFeedProductCounts> get serializer => _$CatalogsFeedProductCountsSerializer();
}

class _$CatalogsFeedProductCountsSerializer implements PrimitiveSerializer<CatalogsFeedProductCounts> {
  @override
  final Iterable<Type> types = const [CatalogsFeedProductCounts, _$CatalogsFeedProductCounts];

  @override
  final String wireName = r'CatalogsFeedProductCounts';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsFeedProductCounts object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.ingested != null) {
      yield r'ingested';
      yield serializers.serialize(
        object.ingested,
        specifiedType: const FullType(int),
      );
    }
    if (object.original != null) {
      yield r'original';
      yield serializers.serialize(
        object.original,
        specifiedType: const FullType(int),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsFeedProductCounts object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsFeedProductCountsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ingested':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.ingested = valueDes;
          break;
        case r'original':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.original = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsFeedProductCounts deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsFeedProductCountsBuilder();
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

