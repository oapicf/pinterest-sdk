//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'get_mmm_report_response_data.g.dart';

/// GetMMMReportResponseData
///
/// Properties:
/// * [reportStatus] 
/// * [size] 
/// * [url] 
@BuiltValue()
abstract class GetMMMReportResponseData implements Built<GetMMMReportResponseData, GetMMMReportResponseDataBuilder> {
  @BuiltValueField(wireName: r'report_status')
  GetMMMReportResponseDataReportStatusEnum? get reportStatus;
  // enum reportStatusEnum {  DOES_NOT_EXIST,  FINISHED,  IN_PROGRESS,  EXPIRED,  FAILED,  CANCELLED,  };

  @BuiltValueField(wireName: r'size')
  num? get size;

  @BuiltValueField(wireName: r'url')
  String? get url;

  GetMMMReportResponseData._();

  factory GetMMMReportResponseData([void updates(GetMMMReportResponseDataBuilder b)]) = _$GetMMMReportResponseData;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(GetMMMReportResponseDataBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<GetMMMReportResponseData> get serializer => _$GetMMMReportResponseDataSerializer();
}

class _$GetMMMReportResponseDataSerializer implements PrimitiveSerializer<GetMMMReportResponseData> {
  @override
  final Iterable<Type> types = const [GetMMMReportResponseData, _$GetMMMReportResponseData];

  @override
  final String wireName = r'GetMMMReportResponseData';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    GetMMMReportResponseData object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.reportStatus != null) {
      yield r'report_status';
      yield serializers.serialize(
        object.reportStatus,
        specifiedType: const FullType(GetMMMReportResponseDataReportStatusEnum),
      );
    }
    if (object.size != null) {
      yield r'size';
      yield serializers.serialize(
        object.size,
        specifiedType: const FullType.nullable(num),
      );
    }
    if (object.url != null) {
      yield r'url';
      yield serializers.serialize(
        object.url,
        specifiedType: const FullType.nullable(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    GetMMMReportResponseData object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required GetMMMReportResponseDataBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'report_status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(GetMMMReportResponseDataReportStatusEnum),
          ) as GetMMMReportResponseDataReportStatusEnum;
          result.reportStatus = valueDes;
          break;
        case r'size':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.size = valueDes;
          break;
        case r'url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
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
  GetMMMReportResponseData deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = GetMMMReportResponseDataBuilder();
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

class GetMMMReportResponseDataReportStatusEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'DOES_NOT_EXIST')
  static const GetMMMReportResponseDataReportStatusEnum DOES_NOT_EXIST = _$getMMMReportResponseDataReportStatusEnum_DOES_NOT_EXIST;
  @BuiltValueEnumConst(wireName: r'FINISHED')
  static const GetMMMReportResponseDataReportStatusEnum FINISHED = _$getMMMReportResponseDataReportStatusEnum_FINISHED;
  @BuiltValueEnumConst(wireName: r'IN_PROGRESS')
  static const GetMMMReportResponseDataReportStatusEnum IN_PROGRESS = _$getMMMReportResponseDataReportStatusEnum_IN_PROGRESS;
  @BuiltValueEnumConst(wireName: r'EXPIRED')
  static const GetMMMReportResponseDataReportStatusEnum EXPIRED = _$getMMMReportResponseDataReportStatusEnum_EXPIRED;
  @BuiltValueEnumConst(wireName: r'FAILED')
  static const GetMMMReportResponseDataReportStatusEnum FAILED = _$getMMMReportResponseDataReportStatusEnum_FAILED;
  @BuiltValueEnumConst(wireName: r'CANCELLED')
  static const GetMMMReportResponseDataReportStatusEnum CANCELLED = _$getMMMReportResponseDataReportStatusEnum_CANCELLED;

  static Serializer<GetMMMReportResponseDataReportStatusEnum> get serializer => _$getMMMReportResponseDataReportStatusEnumSerializer;

  const GetMMMReportResponseDataReportStatusEnum._(String name): super(name);

  static BuiltSet<GetMMMReportResponseDataReportStatusEnum> get values => _$getMMMReportResponseDataReportStatusEnumValues;
  static GetMMMReportResponseDataReportStatusEnum valueOf(String name) => _$getMMMReportResponseDataReportStatusEnumValueOf(name);
}

