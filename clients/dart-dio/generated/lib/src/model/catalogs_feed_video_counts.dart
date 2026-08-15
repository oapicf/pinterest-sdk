//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_feed_video_counts.g.dart';

/// Counts of total, ingested, and not ingested videos in the feed file. The counts may not appear early in the process.
///
/// Properties:
/// * [ingestedVideos] - The number of videos successfully ingested from the feed file.
/// * [notIngestedVideos] - The number of videos that were not ingested from the feed file.
/// * [totalVideos] - The number of videos in the feed file.
@BuiltValue()
abstract class CatalogsFeedVideoCounts implements Built<CatalogsFeedVideoCounts, CatalogsFeedVideoCountsBuilder> {
  /// The number of videos successfully ingested from the feed file.
  @BuiltValueField(wireName: r'ingested_videos')
  int? get ingestedVideos;

  /// The number of videos that were not ingested from the feed file.
  @BuiltValueField(wireName: r'not_ingested_videos')
  int? get notIngestedVideos;

  /// The number of videos in the feed file.
  @BuiltValueField(wireName: r'total_videos')
  int? get totalVideos;

  CatalogsFeedVideoCounts._();

  factory CatalogsFeedVideoCounts([void updates(CatalogsFeedVideoCountsBuilder b)]) = _$CatalogsFeedVideoCounts;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsFeedVideoCountsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsFeedVideoCounts> get serializer => _$CatalogsFeedVideoCountsSerializer();
}

class _$CatalogsFeedVideoCountsSerializer implements PrimitiveSerializer<CatalogsFeedVideoCounts> {
  @override
  final Iterable<Type> types = const [CatalogsFeedVideoCounts, _$CatalogsFeedVideoCounts];

  @override
  final String wireName = r'CatalogsFeedVideoCounts';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsFeedVideoCounts object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.ingestedVideos != null) {
      yield r'ingested_videos';
      yield serializers.serialize(
        object.ingestedVideos,
        specifiedType: const FullType(int),
      );
    }
    if (object.notIngestedVideos != null) {
      yield r'not_ingested_videos';
      yield serializers.serialize(
        object.notIngestedVideos,
        specifiedType: const FullType(int),
      );
    }
    if (object.totalVideos != null) {
      yield r'total_videos';
      yield serializers.serialize(
        object.totalVideos,
        specifiedType: const FullType(int),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsFeedVideoCounts object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsFeedVideoCountsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ingested_videos':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.ingestedVideos = valueDes;
          break;
        case r'not_ingested_videos':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.notIngestedVideos = valueDes;
          break;
        case r'total_videos':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.totalVideos = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsFeedVideoCounts deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsFeedVideoCountsBuilder();
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

