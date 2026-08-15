//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'leads_export_create_response.g.dart';

/// LeadsExportCreateResponse
///
/// Properties:
/// * [leadsExportId] - ID for the leads export job
@BuiltValue()
abstract class LeadsExportCreateResponse implements Built<LeadsExportCreateResponse, LeadsExportCreateResponseBuilder> {
  /// ID for the leads export job
  @BuiltValueField(wireName: r'leads_export_id')
  String? get leadsExportId;

  LeadsExportCreateResponse._();

  factory LeadsExportCreateResponse([void updates(LeadsExportCreateResponseBuilder b)]) = _$LeadsExportCreateResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LeadsExportCreateResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LeadsExportCreateResponse> get serializer => _$LeadsExportCreateResponseSerializer();
}

class _$LeadsExportCreateResponseSerializer implements PrimitiveSerializer<LeadsExportCreateResponse> {
  @override
  final Iterable<Type> types = const [LeadsExportCreateResponse, _$LeadsExportCreateResponse];

  @override
  final String wireName = r'LeadsExportCreateResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LeadsExportCreateResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.leadsExportId != null) {
      yield r'leads_export_id';
      yield serializers.serialize(
        object.leadsExportId,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    LeadsExportCreateResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LeadsExportCreateResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'leads_export_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.leadsExportId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  LeadsExportCreateResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LeadsExportCreateResponseBuilder();
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

