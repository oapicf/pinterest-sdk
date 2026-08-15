//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'leads_export_create_request.g.dart';

/// LeadsExportCreateRequest
///
/// Properties:
/// * [adId] - ID for the ad collecting leads
/// * [endDate] - Export leads collected on and before end date (UTC). Format: YYYY-MM-DD
/// * [startDate] - Export leads collected on and after start date (UTC). Format: YYYY-MM-DD
@BuiltValue()
abstract class LeadsExportCreateRequest implements Built<LeadsExportCreateRequest, LeadsExportCreateRequestBuilder> {
  /// ID for the ad collecting leads
  @BuiltValueField(wireName: r'ad_id')
  String get adId;

  /// Export leads collected on and before end date (UTC). Format: YYYY-MM-DD
  @BuiltValueField(wireName: r'end_date')
  String get endDate;

  /// Export leads collected on and after start date (UTC). Format: YYYY-MM-DD
  @BuiltValueField(wireName: r'start_date')
  String get startDate;

  LeadsExportCreateRequest._();

  factory LeadsExportCreateRequest([void updates(LeadsExportCreateRequestBuilder b)]) = _$LeadsExportCreateRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LeadsExportCreateRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LeadsExportCreateRequest> get serializer => _$LeadsExportCreateRequestSerializer();
}

class _$LeadsExportCreateRequestSerializer implements PrimitiveSerializer<LeadsExportCreateRequest> {
  @override
  final Iterable<Type> types = const [LeadsExportCreateRequest, _$LeadsExportCreateRequest];

  @override
  final String wireName = r'LeadsExportCreateRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LeadsExportCreateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'ad_id';
    yield serializers.serialize(
      object.adId,
      specifiedType: const FullType(String),
    );
    yield r'end_date';
    yield serializers.serialize(
      object.endDate,
      specifiedType: const FullType(String),
    );
    yield r'start_date';
    yield serializers.serialize(
      object.startDate,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    LeadsExportCreateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LeadsExportCreateRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ad_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.adId = valueDes;
          break;
        case r'end_date':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.endDate = valueDes;
          break;
        case r'start_date':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.startDate = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  LeadsExportCreateRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LeadsExportCreateRequestBuilder();
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

