//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/leads_export_status.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'leads_export_response_data.g.dart';

/// LeadsExportResponseData
///
/// Properties:
/// * [downloadUrl] 
/// * [exportStatus] 
@BuiltValue()
abstract class LeadsExportResponseData implements Built<LeadsExportResponseData, LeadsExportResponseDataBuilder> {
  @BuiltValueField(wireName: r'download_url')
  String? get downloadUrl;

  @BuiltValueField(wireName: r'export_status')
  LeadsExportStatus? get exportStatus;
  // enum exportStatusEnum {  IN_PROGRESS,  FINISHED,  FAILED,  };

  LeadsExportResponseData._();

  factory LeadsExportResponseData([void updates(LeadsExportResponseDataBuilder b)]) = _$LeadsExportResponseData;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LeadsExportResponseDataBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LeadsExportResponseData> get serializer => _$LeadsExportResponseDataSerializer();
}

class _$LeadsExportResponseDataSerializer implements PrimitiveSerializer<LeadsExportResponseData> {
  @override
  final Iterable<Type> types = const [LeadsExportResponseData, _$LeadsExportResponseData];

  @override
  final String wireName = r'LeadsExportResponseData';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LeadsExportResponseData object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.downloadUrl != null) {
      yield r'download_url';
      yield serializers.serialize(
        object.downloadUrl,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.exportStatus != null) {
      yield r'export_status';
      yield serializers.serialize(
        object.exportStatus,
        specifiedType: const FullType(LeadsExportStatus),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    LeadsExportResponseData object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LeadsExportResponseDataBuilder result,
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
        case r'export_status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(LeadsExportStatus),
          ) as LeadsExportStatus?;
          if (valueDes == null) continue;
          result.exportStatus = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  LeadsExportResponseData deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LeadsExportResponseDataBuilder();
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

