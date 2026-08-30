//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'dynamic_titles_download_csv.g.dart';

/// DynamicTitlesDownloadCSV
///
/// Properties:
/// * [downloadUrl] - Pre-signed S3 URL to download the CSV file.
@BuiltValue()
abstract class DynamicTitlesDownloadCSV implements Built<DynamicTitlesDownloadCSV, DynamicTitlesDownloadCSVBuilder> {
  /// Pre-signed S3 URL to download the CSV file.
  @BuiltValueField(wireName: r'download_url')
  String? get downloadUrl;

  DynamicTitlesDownloadCSV._();

  factory DynamicTitlesDownloadCSV([void updates(DynamicTitlesDownloadCSVBuilder b)]) = _$DynamicTitlesDownloadCSV;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(DynamicTitlesDownloadCSVBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<DynamicTitlesDownloadCSV> get serializer => _$DynamicTitlesDownloadCSVSerializer();
}

class _$DynamicTitlesDownloadCSVSerializer implements PrimitiveSerializer<DynamicTitlesDownloadCSV> {
  @override
  final Iterable<Type> types = const [DynamicTitlesDownloadCSV, _$DynamicTitlesDownloadCSV];

  @override
  final String wireName = r'DynamicTitlesDownloadCSV';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    DynamicTitlesDownloadCSV object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.downloadUrl != null) {
      yield r'download_url';
      yield serializers.serialize(
        object.downloadUrl,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    DynamicTitlesDownloadCSV object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required DynamicTitlesDownloadCSVBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'download_url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.downloadUrl = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  DynamicTitlesDownloadCSV deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = DynamicTitlesDownloadCSVBuilder();
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

