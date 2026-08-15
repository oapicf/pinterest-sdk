//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/s3_multipart_upload_data.dart';
import 'package:openapi/src/model/customer_list_upload.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'customer_list_upload_create_response.g.dart';

/// CustomerListUploadCreateResponse
///
/// Properties:
/// * [customerListUpload] 
/// * [s3MultipartUploadData] 
@BuiltValue()
abstract class CustomerListUploadCreateResponse implements Built<CustomerListUploadCreateResponse, CustomerListUploadCreateResponseBuilder> {
  @BuiltValueField(wireName: r'customer_list_upload')
  CustomerListUpload get customerListUpload;

  @BuiltValueField(wireName: r's3_multipart_upload_data')
  S3MultipartUploadData get s3MultipartUploadData;

  CustomerListUploadCreateResponse._();

  factory CustomerListUploadCreateResponse([void updates(CustomerListUploadCreateResponseBuilder b)]) = _$CustomerListUploadCreateResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CustomerListUploadCreateResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CustomerListUploadCreateResponse> get serializer => _$CustomerListUploadCreateResponseSerializer();
}

class _$CustomerListUploadCreateResponseSerializer implements PrimitiveSerializer<CustomerListUploadCreateResponse> {
  @override
  final Iterable<Type> types = const [CustomerListUploadCreateResponse, _$CustomerListUploadCreateResponse];

  @override
  final String wireName = r'CustomerListUploadCreateResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CustomerListUploadCreateResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'customer_list_upload';
    yield serializers.serialize(
      object.customerListUpload,
      specifiedType: const FullType(CustomerListUpload),
    );
    yield r's3_multipart_upload_data';
    yield serializers.serialize(
      object.s3MultipartUploadData,
      specifiedType: const FullType(S3MultipartUploadData),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CustomerListUploadCreateResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CustomerListUploadCreateResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'customer_list_upload':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CustomerListUpload),
          ) as CustomerListUpload;
          result.customerListUpload.replace(valueDes);
          break;
        case r's3_multipart_upload_data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(S3MultipartUploadData),
          ) as S3MultipartUploadData;
          result.s3MultipartUploadData.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CustomerListUploadCreateResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CustomerListUploadCreateResponseBuilder();
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

