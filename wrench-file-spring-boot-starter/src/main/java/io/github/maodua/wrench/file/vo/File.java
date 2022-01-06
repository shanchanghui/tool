package io.github.maodua.wrench.file.vo;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class File {
    /**
     * 文件的原始名称，只包括名称不包括路径
     */
    @NotBlank(message = "文件名称不能为空。")
    private String filename;
    /**
     * 文件的实际保存路径,或者文件访问url
     */
    @NotBlank(message = "文件路径不能为空。")
    private String filepath;
    /**
     * 文件路径
     */
    @NotBlank(message = "文件类型不能为空。")
    private String fileType;
    /**
     * 文件的大小
     */
    @NotNull(message = "文件大小不能为空。")
    private Long size;
    /**
     * 扩展字段
     */
    private String extend;
}
